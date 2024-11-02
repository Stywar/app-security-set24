package com.polyglot.appaccount.controller;

import java.io.Serializable;


public class CustomerModel implements Serializable {
    private static final long serialVersionUID = 1L;  

    private Integer idCustomer;
   
    private String fullName;
   
    private String email;

    public Integer getIdCustomer() {
        return idCustomer;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
}