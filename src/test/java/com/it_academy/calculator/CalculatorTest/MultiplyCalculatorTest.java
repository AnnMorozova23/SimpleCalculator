package com.it_academy.calculator.CalculatorTest;


import com.it_academy.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyCalculatorTest {


    @ParameterizedTest
    @CsvSource(value = {"1.0, 1.0, 1.0", "-1.0, 1.0, -1.0", "-6.0, 6.0, -36.0"})
    public void testMultiplyFunction(double firstNum, double secondNum, double expectedResult) {
        Assertions.assertEquals(expectedResult, Calculator.multiply(firstNum, secondNum), "Multiply works incorrect for values");
    }
}
