package com.service.provider1.controller;

import org.springframework.stereotype.Component;


@Component
public class Provider1Delegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
