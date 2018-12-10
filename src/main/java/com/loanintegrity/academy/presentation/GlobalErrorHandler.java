package com.loanintegrity.academy.presentation;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalErrorHandler implements ErrorController {

    private static final String PATH="/error";


       @RequestMapping(value=PATH)
    public String error() {
        return "errorPage";

    }


    @Override

    public String getErrorPath()
    {
        return this.PATH;
    }





}