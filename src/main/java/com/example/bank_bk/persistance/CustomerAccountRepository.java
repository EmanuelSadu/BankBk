package com.example.bank_bk.persistance;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccountEntity,Long> {

     CustomerAccountEntity findAllByAccountId(Long id);

}
