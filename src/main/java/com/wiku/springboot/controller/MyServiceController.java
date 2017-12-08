/*
 * Copyright (c) 2017 Wiku. All rights reserved.
 */
package com.wiku.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MyServiceController
{
    int i=0;
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public TestResponse test()
    {
        return new TestResponse(i++,new Date().toString(),"hello");
    }


}
