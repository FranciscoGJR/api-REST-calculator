package com.jr.api.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sum")
public class SumController {

	//GET
    @GetMapping(value = "/{num0}/{num1}")
    public Long sum(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1) {
            return num0 + num1; 
    }
      
}
