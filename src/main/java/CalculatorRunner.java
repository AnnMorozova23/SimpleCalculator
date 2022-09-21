public class CalculatorRunner {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        double num1 = CalculatorInputService.getNumbers();
        double num2 = CalculatorInputService.getNumbers();
        char operation = CalculatorInputService.getOperation();
        System.out.println("The result is: " + getResult(num1, num2, operation));
    }


    public static double getResult(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = Calculator.sum(num1, num2);
                break;
            case '-':
                result = Calculator.subtract(num1, num2);
                break;
            case '*':
                result = Calculator.multiply(num1, num2);
                break;
            case '/':
                result = Calculator.division(num1, num2);
                break;
            default:
                System.out.println("Wrong operation, please try again");
                result = getResult(num1, num2, CalculatorInputService.getOperation());
        }
        return result;
    }
}
