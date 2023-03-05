package com.jr.api.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sum")
public class SomaController {

	//GET
    @GetMapping
        public int sum() {
        return 4 + 3; 
    }
      
}
