package com.example.bank_bk.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public @ResponseBody String accountNotFound(Exception e){
        return e.getMessage();
    }
}
