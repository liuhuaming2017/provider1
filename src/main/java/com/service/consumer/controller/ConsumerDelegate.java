package com.service.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;


@Component
public class ConsumerDelegate {
    
    private static RestTemplate restTemplate = RestTemplateBuilder.create();
    public String helloworld(String name){
        // Do Some Magic Here!
        String sayHelloResult = restTemplate.getForObject("cse://lhmtest/helloworld?name=" + name, null, String.class);
        return sayHelloResult;


    }
}
