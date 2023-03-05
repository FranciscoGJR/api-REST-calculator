package com.jr.api.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/soma")

public class SomaController {

	//GET
    @GetMapping
    public int soma() {
        return 4 + 3; 
    }
    
    
}