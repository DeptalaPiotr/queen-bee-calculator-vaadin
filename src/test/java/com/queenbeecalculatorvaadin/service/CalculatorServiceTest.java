package com.queenbeecalculatorvaadin.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.Month;

@SpringBootTest
class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void calculate() {

        // Given
        LocalDateTime testDataAndTime = LocalDateTime.of(2023,
                Month.JULY, 02, 19, 30, 40);

        // When
        calculatorService.calculate(testDataAndTime);

        // Then
        Assertions.assertAll(
                ()->Assertions.assertNotNull(testDataAndTime,"testDataAndTime is NULL!")
        );
    }
}