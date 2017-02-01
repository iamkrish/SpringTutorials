/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example1;

/**
 *
 * @author raghu
 */
public class Greeting {
    private final String message;
    private final long id;

    public Greeting(String message, long id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }
    
    
    
}
