/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example1;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raghu
 */

@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private static final AtomicLong counter = new AtomicLong();

    public GreetingController() {
    }
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "Universe") String name){
        
        return new Greeting(String.format(template, name), counter.incrementAndGet());
    }
    
}
