package com.example.bank_bk.service;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import com.example.bank_bk.persistance.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountInfoService {

    @Autowired private CustomerAccountRepository customerAccountRepository;

    public  void save(CustomerAccountEntity customerAccountDto) {
        customerAccountRepository.save(customerAccountDto);
    }

    public CustomerAccountEntity getAccountInfo(Long id){
        return customerAccountRepository.findAllByAccountId(id);
    }
}
