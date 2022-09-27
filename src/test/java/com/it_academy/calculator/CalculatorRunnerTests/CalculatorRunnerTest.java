package com.it_academy.calculator.CalculatorRunnerTests;


import com.it_academy.calculator.CalculatorRunner;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class CalculatorRunnerTest {

    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testPrintResult() {
        CalculatorRunner.printResult(1.0, 2.0, '+');
        Assertions.assertEquals("The result is: " + 3.0, output.toString());
    }


    @ParameterizedTest
    @CsvSource(value = {"0.0, 1.0, 1.0, '-'", "-4.0, -2.0, -2.0, +", "-6.0, -3.0, 2.0, *", "2, 6, 3, /"})
    public void testGetResult(double expectedResult, double firstNum, double secondNum, char operation) {
        {
            Assertions.assertEquals(expectedResult, CalculatorRunner.getResult(firstNum, secondNum, operation), "Divide works incorrect for values");

        }
    }

    @Disabled
    @ParameterizedTest
    @CsvSource(value = {"2.0, 3.0, ;"})
    public void testGetResultWithParameterResolutionException(double firstNum, double secondNum, char operation) {

        CalculatorRunner.getResult(firstNum, secondNum, operation);
    }


    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
