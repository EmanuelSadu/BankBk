package com.example.bank_bk.service;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import com.example.bank_bk.persistance.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountInfoService {

@Autowired private CustomerAccountRepository customerAccountRepository;

    public List<CustomerAccountEntity> getAccountInfo(){
        return customerAccountRepository.findAll();
    }
}
