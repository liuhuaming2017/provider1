package com.service.consumer.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-01T14:17:27.093Z")

@RestSchema(schemaId = "consumer")
@RequestMapping(path = "/consumer", produces = MediaType.APPLICATION_JSON)
public class ConsumerImpl {

    @Autowired
    private ConsumerDelegate userConsumerDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userConsumerDelegate.helloworld(name);
    }

}
