import java.util.Scanner;

public class CalculatorInputService {

    static Scanner scanner = new Scanner(System.in);

    public static char getOperation() {
        System.out.print("Enter needs operation (+, - , * , /): ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static double getNumbers() {
        System.out.print("Enter number: ");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Wrong! Please, enter numbers again");
            scanner.next();
            num = getNumbers();
        }
        return num;
    }
}
