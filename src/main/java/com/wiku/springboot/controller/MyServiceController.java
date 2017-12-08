/*
 * Copyright (c) 2017 Wiku. All rights reserved.
 */
package com.wiku.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MyServiceController
{
    
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test()
    {
        return "hello";
    }


}
