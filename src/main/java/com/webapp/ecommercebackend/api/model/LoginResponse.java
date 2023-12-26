package com.webapp.ecommercebackend.api.model;

public class LoginResponse {

    private String jwt;

    private String getJwt(){
        return jwt;
    }

    public  void setJwt(String jwt){
        this.jwt = jwt;
    }
}
