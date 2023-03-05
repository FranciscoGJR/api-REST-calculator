package com.jr.api.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subtract")
public class SubtractionController {

     //GET
    @GetMapping(value = "/{num0}/{num1}") 
    public int subtraction(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1){
        return (int) (num0 - num1);
    }
    
}
