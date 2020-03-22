package com.taxCalculator.calculateTax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {
    @GetMapping("/tax")
    public String tax(){
        return "welcome to tax application";
    }
}
