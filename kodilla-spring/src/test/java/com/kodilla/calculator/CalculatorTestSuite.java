package com.kodilla.calculator;

import com.kodilla.spring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

        @Test
        public void testCalculation() throws IllegalAccessException {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(4, 2);
        double resultSub = calculator.sub(2, 2);
        double resultMul = calculator.mul(1, 2);
        double resultDiv = calculator.div(6, 3);

        //Then
        assertEquals(6, resultAdd, 0);
        assertEquals(0, resultSub, 0);
        assertEquals(2, resultMul, 0);
        assertEquals(2, resultDiv, 0);
    }
}
