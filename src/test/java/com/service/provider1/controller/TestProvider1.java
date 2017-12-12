package com.service.provider1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProvider1 {

        Provider1Delegate provider1Delegate = new Provider1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = provider1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}