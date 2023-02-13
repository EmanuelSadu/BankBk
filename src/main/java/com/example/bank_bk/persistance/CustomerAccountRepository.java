package com.example.bank_bk.persistance;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccountEntity,Long> {
}
