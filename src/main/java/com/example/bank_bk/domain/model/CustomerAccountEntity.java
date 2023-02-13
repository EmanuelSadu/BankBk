package com.example.bank_bk.domain.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ACCOUNT", schema = "dev", catalog = "")
public class CustomerAccountEntity {
    @Basic
    @Column(name = "ACCOUNT_ID")
    private String accountId;
    @Basic
    @Column(name = "ACCOUNT_VALUE")
    private Integer accountValue;
    @Basic
    @Column(name = "ACCOUNT_CURRENCY")
    private String accountCurrency;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
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
        return Objects.equals(accountId, that.accountId) && Objects.equals(accountValue, that.accountValue) && Objects.equals(accountCurrency, that.accountCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountValue, accountCurrency);
    }
}
