package com.it_academy.calculator.CalculatorInputServiceTests;

import com.it_academy.calculator.CalculatorMock.CalculatorInputServiceMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculatorInputServiceTest {


    @ParameterizedTest
    @CsvSource(value = {"2.0, 2.0", "-4.0, -4.0", "-6.5, -6.5"})
    public void testGetNumbersWithNumberParameters(double result, double value) {

        CalculatorInputServiceMock serviceMock = mock(CalculatorInputServiceMock.class);
        when(serviceMock.forNumberInput()).thenReturn(Double.valueOf(value));
        Assertions.assertEquals(result, serviceMock.forNumberInput());
    }


    @Test
    public void testGetNumbersWithNotNumberParameters() {

        CalculatorInputServiceMock serviceMock = mock(CalculatorInputServiceMock.class);

        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            when(serviceMock.forNumberInput()).thenReturn(Double.valueOf("TestEnterNumber;"));
        });
    }

    @ParameterizedTest
    @CsvSource(value = {"+, +", "-, -", "/, /", "*, *"})
    public void testGetOperationWithCharParameters(char result, char value) {

        CalculatorInputServiceMock serviceMock = mock(CalculatorInputServiceMock.class);
        when(serviceMock.forOperationInput()).thenReturn((value));
        Assertions.assertEquals(result, serviceMock.forOperationInput());
    }


}
