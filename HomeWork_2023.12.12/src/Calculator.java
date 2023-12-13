import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("      Input a number (or 'q' to quit):");
        String input1 = sc.nextLine();

        double num1;
        if (input1.equals("q")) {
            return;
        } else {
            num1 = Double.parseDouble(input1.replace(',','.'));
        }

        System.out.println("      Input a needed operation '+', '-', '*' , '/' (or 'q' to quit):");
        String input3 = sc.nextLine();

        char operation;
        if (input3.equals("q")) {
            return;
        } else {
            operation = input3.charAt(0);
        }

        System.out.println("      Input another number (or 'q' to quit):");
        String input2 = sc.nextLine();

        double num2;
        if (input2.equals("q")) {
            return;
        } else {
            num2 = Double.parseDouble(input2.replace(',','.'));
        }



        double result = 0;

// Option 1
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            System.out.println("You didn't input any operation '+', '-', '*' or '/'");
        }
        System.out.println("The result is: " + result);
//Option 2
        double result1 = 0;
        switch(operation) {
            case '+':
                result1 = num1 + num2;
                break;
            case '-':
                result1 = num1 - num2;
                break;
            case '*':
                result1 = num1 * num2;
                break;
            case '/':
                result1 = num1 / num2;
                break;
            default:
                System.out.println("You didn't input any operation '+', '-', '*' or '/'");
        }
        System.out.println("The result is: " + result1);
    }
}
