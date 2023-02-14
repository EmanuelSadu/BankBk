package com.example.bank_bk.persistance;

import com.example.bank_bk.domain.model.CustomerAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccountEntity,Long> {

    /*
    @Query("Select ca.accountId, ca.accountValue, ca.accountCurrency from CustomerAccountEntity ca")
     List<CustomerAccountEntity> findAllCA();
    */
}
