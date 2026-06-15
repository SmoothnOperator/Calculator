import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = scanner.nextDouble();
        System.out.println("choose: - (+,-,*,/");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result:" + result);
                } else {
                    System.out.println("error");
                }
                break;
        }
        scanner.close();
    }
}