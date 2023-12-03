public class HomeWork_2023_11_30_part2 {


    static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static double Division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println(Addition(10, 5));
        System.out.println(Subtraction(30, 5));
        System.out.println(Multiplication(8, 5));
        System.out.println(Division(9, 5));

    }
}
