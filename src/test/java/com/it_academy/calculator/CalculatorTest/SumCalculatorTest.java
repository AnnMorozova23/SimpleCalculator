package com.it_academy.calculator.CalculatorTest;


import com.it_academy.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"1.0, 1.0, 2.0", "-1.0, 1.0, 0.0", "-6.0, 6.5, 0.5"})
    public void testSumFunction(double firstNum, double secondNum, double expectedResult) {
        Assertions.assertEquals(expectedResult, Calculator.sum(firstNum, secondNum), "Sum works incorrect for values");

    }
}
