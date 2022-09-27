package com.it_academy.calculator.CalculatorTest;


import com.it_academy.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractCalculatorTest {


    @ParameterizedTest
    @CsvSource(value = {"1.0, 1.0, 0.0", "-1.0, 1.0, -2.0", "-6.0, 6.5, -12.5"})
    public void testSubtractFunction(double firstNum, double secondNum, double expectedResult) {
        Assertions.assertEquals(expectedResult, Calculator.subtract(firstNum, secondNum), "Subtract works incorrect for values");
    }
}

