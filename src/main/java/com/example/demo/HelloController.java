/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Gaby
 */
@RestController
public class HelloController {
    
    private static final String template = "Hello %s!";
  
    @RequestMapping(value="/hello/{name}")
    public HelloMsg greeting( @PathVariable("name")  String name) {
        return new HelloMsg(String.format(template, name));
    }
    
}
