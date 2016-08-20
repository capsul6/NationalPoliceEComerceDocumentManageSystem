package com.oleg.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SigninController {

    private static final Logger LOGGER = Logger.getLogger("signinLogger");

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin() {
        LOGGER.debug("Receive request to show signin page");
        return "generalView/signin";
    }

    @RequestMapping(value = "/signin-failure", method = RequestMethod.GET)
    public String signinFailure() {
        LOGGER.debug("Receive request to show signin-failure page");
        return "generalView/signin_failure";
    }
}
