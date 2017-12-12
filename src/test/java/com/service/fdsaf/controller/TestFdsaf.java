package com.service.fdsaf.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFdsaf {

        FdsafDelegate fdsafDelegate = new FdsafDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = fdsafDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}