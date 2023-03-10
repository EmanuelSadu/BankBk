package com.example.bank_bk.controller;

import com.example.bank_bk.domain.model.CustomerAccountEntity;

import com.example.bank_bk.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AccountCreate {

    @Autowired
    private AccountInfoService accountInfoService;

    @PostMapping (value = "account", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void accountCreate(@RequestBody CustomerAccountEntity customerAccountDto){
        accountInfoService.save(customerAccountDto);
    }
}
