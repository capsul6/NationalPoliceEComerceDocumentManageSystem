package com.oleg.project.controller;


import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.DeputeAppealFiles;
import com.oleg.project.dto.appealDto.DeputeAppealDto;
import com.oleg.project.dto.requestDto.DeputeAppealForRequestDto;
import com.oleg.project.service.AppealService.AppealService;
import com.oleg.project.service.AppealService.GeneralAppealServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@Controller("deputeAppealController")
@RequestMapping(value = "/deputeAppeal")
public class DeputeAppealController {

    private static final Logger LOGGER = Logger.getLogger("deputeAppealController");

    @Qualifier("deputeAppealService")
    @Autowired
    private AppealService<DeputeAppeal, DeputeAppealDto> deputeAppealService;

    @Qualifier("generalAppealService")
    @Autowired
    private GeneralAppealServiceImpl generalAppealService;

    @RequestMapping(value = "/newDeputeAppeal", method = RequestMethod.GET)
    public String getAddNewAppealPage(Model model){
        LOGGER.debug("Receive request to show add page");
        //each next appeal must be with reserved number
        int number;
        try {
        number = generalAppealService.getNumberForDeputeAppeal() + 1;
        } catch (NullPointerException e) {
            number = 1;
        }
        model.addAttribute("number", number);
        return "deputeAppealView/addDeputeAppealPage";
    }

    @RequestMapping(value = "/newDeputeAppealPost", method = RequestMethod.POST)
    public String addNewAppeal(@ModelAttribute("deputeAppeal")DeputeAppealDto deputeAppealDto) {
        LOGGER.debug("Receive request to add new deputeAppeal");
        deputeAppealService.add(deputeAppealDto);
        return "deputeAppealView/addedDeputeAppeal";
    }

    @RequestMapping(value = "/detailInformationAboutDeputeAppeal", method = RequestMethod.GET)
    public String getInformPage(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("Receive request to show detailInformation page");
        DeputeAppeal deputeAppeal = deputeAppealService.getById(id);
        model.addAttribute("deputeAppealIdForInformPage", deputeAppeal);
        return "deputeAppealView/informDeputeAppealPage";
    }

    @RequestMapping(value = "/getPageForUploadFileForDeputeAppeal", method = RequestMethod.GET)
    public String getUploadFile(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("Receive request to show add file page");
        model.addAttribute("deputeAppealId", deputeAppealService.getById(id));
        return "deputeAppealView/addFileToDeputeAppeal";
    }

    @RequestMapping(value = "/uploadingPageFileForDeputeAppeal", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file,
                             @RequestParam(value = "id", required = true) int id,
                             Model model){
        LOGGER.debug("Receive request to add file");
        if(!file.isEmpty()){
            try {
                byte [] bytes = file.getBytes();
                DeputeAppeal deputeAppeal = deputeAppealService.getById(id);
                //Creating the directory to store file
                String path = System.getProperty("user.home");
                File directory = new File(path + File.separator + "DeputeAppealsFiles" + File.separator + deputeAppeal.getIncomeNumber());
                if(!directory.exists())
                    directory.mkdirs();

                // Create the file on server
                File serverFile = new File(directory.getAbsolutePath() + File.separator + file.getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                DeputeAppealFiles deputeAppealFiles = new DeputeAppealFiles();
                deputeAppealFiles.setDeputeAppeal(deputeAppeal);
                deputeAppealFiles.setFilePath(serverFile.getAbsolutePath());
                deputeAppealFiles.setFileType(file.getContentType());
                deputeAppeal.getDeputeAppealFiles().add(deputeAppealFiles);
                deputeAppealService.editFilePath(deputeAppealFiles);
                model.addAttribute("deputeAppealId", deputeAppeal);
                model.addAttribute("fileDirection", deputeAppealFiles.getFilePath());

            } catch (Exception e) {
                return "You failed to upload " + file.getName() + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + file.getName()
                    + " because the file was empty.";
        }

        return "deputeAppealView/addedFile";
    }

    @RequestMapping(value = "/downloadFile", method = RequestMethod.GET)
    public void downloadFile(HttpServletResponse response, @RequestParam(value = "id", required = true) int id) {
        try {
            DeputeAppeal deputeAppeal = deputeAppealService.getById(id);
            // get your file as InputStream
            InputStream is = new FileInputStream(deputeAppeal.getDeputeAppealFiles().get(id - 1).getFilePath());
            // copy it to response's OutputStream
            org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException ex) {
            throw new RuntimeException("IOError writing file to output stream");
        }
    }


    @RequestMapping(value = "/deleted", method = RequestMethod.GET)
    public String deleteDeputeAppeal(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("Receive request to delete appeal");
        deputeAppealService.delete(id);
        model.addAttribute("id", id);
        return "deletedPage";
    }

    @RequestMapping(value = "/editPage", method = RequestMethod.GET)
    public String getEditDeputeAppeal(@RequestParam(value = "id", required = true) int id, Model model){
        LOGGER.debug("Receive request to show edit page");
        model.addAttribute("editedAppeal", deputeAppealService.getById(id));
        return "deputeAppealView/deputeAppealEditPage";
    }

    @RequestMapping(value = "/editPage", method = RequestMethod.POST)
    public String editCurrentAppeal(@ModelAttribute("deputeAppealForEdit") DeputeAppealDto deputeAppealDto,
                                    @RequestParam(value = "id", required = true)int id) {
        LOGGER.debug("Receive request for edit current appeal");
        DeputeAppeal deputeAppeal = deputeAppealService.editFromDtoToEntity(deputeAppealDto);
        deputeAppeal.setId(id);
        deputeAppealService.edit(deputeAppeal);
        return "deputeAppealView/deputeAppealEditingSuccesfull";
    }

    @RequestMapping(value = "/deputeAppealSearchPage", method = RequestMethod.GET)
    public String getDeputeAppealSearchPage(){
        LOGGER.debug("Receive request to show deputeAppealSearchPage");
        return "deputeAppealView/deputeAppealSearchPage";
    }


    @RequestMapping(value = "/deputeAppealSearchPageResult", method = RequestMethod.GET)
    public String resultOfSearchingDeputeAppeal(@ModelAttribute("appealForRequest")DeputeAppealForRequestDto deputeAppealForRequestDto, Model model){
        LOGGER.debug("Receive request to get searching Depute Appeals list");
            List<DeputeAppeal>deputeAppealList = deputeAppealService.individualSearch(deputeAppealForRequestDto);
            model.addAttribute("deputeAppealList", deputeAppealList);
            return "deputeAppealView/deputeAppealSearchPageResult";
    }
    }