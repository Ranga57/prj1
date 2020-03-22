package com.taxCalculator.calculateTax.service;

import org.springframework.stereotype.Component;

@Component
public class CalculateTaxInterfaceImpl implements CalculateTaxInterface {
    @Override
    public double calculateTax(double mrp,double taxRate){
        double calculatedTax;
        return calculatedTax = mrp*taxRate;
    }
}
