package com.example.bank_bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/accountId")
public class AccountInfo {

    @GetMapping
    public @ResponseBody String getAccountInfo(){
        return "ok";
    }
}
