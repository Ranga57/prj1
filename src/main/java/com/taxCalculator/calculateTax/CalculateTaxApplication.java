package com.taxCalculator.calculateTax;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.taxCalculator.calculateTax.service.CalculateTaxInterface;
import com.taxCalculator.calculateTax.service.CalculateTaxInterfaceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculateTaxApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(CalculateTaxApplication.class, args);
		CalculateTaxInterface context = (CalculateTaxInterface) ctx.getBean(CalculateTaxInterfaceImpl.class);
		System.out.println(context.calculateTax(100,.03));
	}

}
