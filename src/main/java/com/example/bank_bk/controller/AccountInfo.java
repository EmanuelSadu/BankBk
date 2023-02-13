package com.example.bank_bk.controller;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import com.example.bank_bk.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accountId")
public class AccountInfo {

    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping
    public @ResponseBody List<CustomerAccountEntity> getAccountInfo(){
        return accountInfoService.getAccountInfo();
    }
}
