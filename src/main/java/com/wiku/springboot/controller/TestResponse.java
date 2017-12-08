/*
 * Copyright (c) 2017 Wiku. All rights reserved.
 */
package com.wiku.springboot.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestResponse
{
    int id;
    String date;
    String message;
    
    public TestResponse( int id, String date, String message )
    {
        super();
        this.id = id;
        this.date = date;
        this.message = message;
    }
}
