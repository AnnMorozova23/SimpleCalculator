package com.it_academy.calculator.CalculatorTest;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({DivideCalculatorTest.class,
        MultiplyCalculatorTest.class,
        SubtractCalculatorTest.class,
        SumCalculatorTest.class})

public class CalculatorTest {

}
