package com.example.FirstProject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Payment {
    
    @GetMapping("/payment")
    public String getMethodName() {
        return "Payment";
    }
    
}
