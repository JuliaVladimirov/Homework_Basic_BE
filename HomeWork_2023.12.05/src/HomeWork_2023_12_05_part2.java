public class HomeWork_2023_12_05_part2 {

    static void addNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    static int addNumbers1(int num1, int num2) {
        return num1 + num2;
    }

    static void subtractNumbers(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    static int subtractNumbers1(int num1, int num2) {
        return num1 - num2;
    }

    static void multiplicateNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    static int multiplicateNumbers1(int num1, int num2) {
        return num1 * num2;
    }

    static void divideNumbers(int num1, int num2) {
        System.out.println((double) num1 / num2);

    }
    static double divideNumbers1(int num1, int num2) {
        return (double) num1 / num2;

    }

    public static void main(String[] args) {
        addNumbers(7,4);
        int addition = addNumbers1(10,5);
        System.out.println(addition);

        subtractNumbers(25,9);
        int subtraction = subtractNumbers1(30,5);
        System.out.println(subtraction);

        multiplicateNumbers(8, 5);
        int multiplication = multiplicateNumbers1(7, 3);
        System.out.println(multiplication);

        divideNumbers(9, 5);
        double division = divideNumbers1(12, 5);
        System.out.println(division);

    }
}
