package com.it_academy.calculator.CalculatorMock;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorInputServiceMock {

    private final Scanner scanner;
    private final PrintStream out;

    public CalculatorInputServiceMock(InputStream in, PrintStream out) {
        scanner = new Scanner(System.in);
        this.out = out;
    }

    public double forNumberInput() {
        out.println("Enter number");
        return scanner.nextDouble();
    }

    public char forOperationInput() {
        out.println("Enter operation");
        return scanner.next().charAt(0);
    }

}

