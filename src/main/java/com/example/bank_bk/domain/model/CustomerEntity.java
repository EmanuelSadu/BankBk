package com.example.bank_bk.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "customer", schema = "dev", catalog = "")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Basic
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Basic
    @Column(name = "CUSTOMER_COUNTRY")
    private String customerCountry;
    @Basic
    @Column(name = "CUSTOMER_CNP")
    private String customerCnp;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerCnp() {
        return customerCnp;
    }

    public void setCustomerCnp(String customerCnp) {
        this.customerCnp = customerCnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId && Objects.equals(customerName, that.customerName) && Objects.equals(customerCountry, that.customerCountry) && Objects.equals(customerCnp, that.customerCnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerCountry, customerCnp);
    }
}
