package com.service.provider1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-13T06:21:47.037Z")

@RestSchema(schemaId = "provider1")
@RequestMapping(path = "/provider1", produces = MediaType.APPLICATION_JSON)
public class Provider1Impl {

    @Autowired
    private Provider1Delegate userProvider1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProvider1Delegate.helloworld(name);
    }
    
     @RequestMapping(value = "/getuname",        
        produces = { "application/json" },         
        method = RequestMethod.GET)    
    public String getuname( @RequestParam(value = "name", required = true) String name,
                            @RequestParam(value = "test", required = true) String test){
        return userProvider1Delegate.helloworld(name,test);    
    }

}
