package com.it_academy.calculator.CalculatorTest;


import com.it_academy.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class DivideCalculatorTest {


    @ParameterizedTest
    @CsvSource(value = {"1.0, 1.0, 1.0", "-4.0, 2.0, -2.0", "-6.0, 6.0, -1.0"})
    public void testDivideFunction(double firstNum, double secondNum, double expectedResult) {
        Assertions.assertEquals(expectedResult, Calculator.division(firstNum, secondNum), "Divide works incorrect for values");
    }



    @Test
    public void testDivideFunctionWithZero() {

        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.division(1, 0);
        });

        Assertions.assertEquals("Dividing by 0 is undefined", thrown.getMessage());
    }
}
