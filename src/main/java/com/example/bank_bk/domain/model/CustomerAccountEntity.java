package com.example.bank_bk.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ACCOUNT", schema = "dev", catalog = "")
public class CustomerAccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ACCOUNT_ID")
    private int accountId;
    @Basic
    @Column(name = "ACCOUNT_VALUE")
    private Integer accountValue;
    @Basic
    @Column(name = "ACCOUNT_CURRENCY")
    private String accountCurrency;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(Integer accountValue) {
        this.accountValue = accountValue;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAccountEntity that = (CustomerAccountEntity) o;
        return accountId == that.accountId && Objects.equals(accountValue, that.accountValue) && Objects.equals(accountCurrency, that.accountCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountValue, accountCurrency);
    }
}
