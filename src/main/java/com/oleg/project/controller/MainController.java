package com.oleg.project.controller;

import com.oleg.project.domain.Appeal.AccessAppeal;
import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.LawyerAppeal;
import com.oleg.project.service.AppealService.GeneralAppealServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    @Autowired
    private GeneralAppealServiceImpl generalAppealService;

    private static final Logger LOGGER = Logger.getLogger("mainController");

    @RequestMapping(value = "/Menu", method = RequestMethod.GET)
    public String getMainPage(){
        LOGGER.debug("Receive request to show main page");
        return "generalView/mainPage";
    }

    @RequestMapping(value = "/GeneralSearchResult", method = RequestMethod.GET)
    public String getGeneralSearchResult(@ModelAttribute(value = "searchingChar")String searchingChar,
                                         Model model) {
        List<DeputeAppeal> appealList = generalAppealService.getAllDeputeAppeals(searchingChar);
        model.addAttribute("deputeAppealList", appealList);
        List<AccessAppeal> accessAppealList = generalAppealService.getAllAccessAppeals(searchingChar);
        model.addAttribute("accessAppealList", accessAppealList);
        List<LawyerAppeal> lawyerAppealList = generalAppealService.getAllLawyerAppeals(searchingChar);
        model.addAttribute("lawyerAppealList", lawyerAppealList);
        return "generalView/appealSearchResult";
    }
}
