package com.oleg.project.controller;


import com.oleg.project.dao.DeputesAppealDao;
import com.oleg.project.domain.DeputesAppeal;
import com.oleg.project.service.DeputesAppealService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    private static final Logger LOGGER = Logger.getLogger("mainController");

    @Autowired
    DeputesAppealService deputesAppealService;

    @Autowired
    DeputesAppealDao deputesAppealDao;


    @RequestMapping(value = "/mainFrame", method = RequestMethod.GET)
    public String getMainPage(){
        LOGGER.debug("Receive request to show main page");
        return "mainPage";
    }

    @RequestMapping(value = "/resultOfSearching", method = RequestMethod.GET)
    public String getSearchResult(Model model, @ModelAttribute("searchChar")String searchResult)  {
        LOGGER.debug("Receive request to show result of searching");
        List<DeputesAppeal> deputesAppeals = deputesAppealService.abstractSearch(searchResult);
        model.addAttribute("ListOfAppeals", deputesAppeals);
        return "searchingResultPage";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getAddNewAppealPage(){
        LOGGER.debug("Receive request to show add page");
        return "addPage";
    }


    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addNewAppeal(DeputesAppeal deputesAppeal) {
        LOGGER.debug("Receive request to add new appeal");
        deputesAppealService.add(deputesAppeal);
        return "mainPage";
    }

    @RequestMapping(value = "/getUpload", method = RequestMethod.GET)
    public String getUploadFile(@RequestParam(value = "id", required = true) Long id, Model model){
        LOGGER.debug("Receive request to show add file page");
        model.addAttribute("Appeal", deputesAppealService.getById(id));
        return "addFile";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file,
                             @RequestParam("name") String name,
                             @ModelAttribute("Appeal") DeputesAppeal deputesAppeal){
        LOGGER.debug("Receive request to add file");
        if(!file.isEmpty()){
            try {
                byte [] bytes = file.getBytes();

                //Creating the directory to store file
                String path = System.getProperty("user.home");
                File directory = new File(path + File.separator + "downloadFilesFromApplication");
                if(!directory.exists())
                    directory.mkdirs();

                // Create the file on server
                File serverFile = new File(directory.getAbsolutePath() + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                deputesAppeal.setFilePath(serverFile.getAbsolutePath());

            } catch (Exception e) {
                return "You failed to upload " + file.getName() + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + file.getName()
                    + " because the file was empty.";
        }

        return "addedFile";
    }


    @RequestMapping(value = "/deleted", method = RequestMethod.GET)
    public String deleteAppeal(@RequestParam(value = "id", required = true) Long id, Model model){
        LOGGER.debug("Receive request to delete appeal");
        deputesAppealService.delete(id);
        model.addAttribute("id", id);
        return "deletedPage";
    }

    @RequestMapping(value = "/editPage", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value = "id", required = true) Long id, Model model){
        LOGGER.debug("Receive request to show edit page");
        model.addAttribute("editedAppeal", deputesAppealService.getById(id));
        return "editPage";
    }

    @RequestMapping(value = "/editPage", method = RequestMethod.POST)
    public String editCurrentAppeal(@ModelAttribute("userAttribute") DeputesAppeal deputesAppeal,
                                    @RequestParam(value = "id", required = true)Long id, Model model) {
        LOGGER.debug("Receive request to edit current appeal");
        deputesAppeal.setId(id);
        deputesAppealService.edit(deputesAppeal);
        model.addAttribute("id", id);
        return "editedPage";
    }
    }