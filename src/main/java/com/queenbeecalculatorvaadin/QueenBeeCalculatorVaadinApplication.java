package com.queenbeecalculatorvaadin;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class QueenBeeCalculatorVaadinApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(QueenBeeCalculatorVaadinApplication.class, args);
	}

}