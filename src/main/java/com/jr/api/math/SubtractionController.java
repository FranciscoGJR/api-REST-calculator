package com.jr.api.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subtract")
public class SubtractionController {

     //GET
    @GetMapping 
    public int subtraction(){
        return 4 - 1;
    }
    
}
