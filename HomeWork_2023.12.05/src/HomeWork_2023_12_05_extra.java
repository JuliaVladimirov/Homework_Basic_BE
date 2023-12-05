import java.util.Scanner;

//1. Программа запрашивает у пользователя сумму в Евро для конвертации
//2. Реализовать метод, который конвертирует полученную сумму в сумму в долларах США

public class HomeWork_2023_12_05_extra {

    public static double convertToDollar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Euro amount you want to convert. The number" +
                " must be whole:");
        int currency = sc.nextInt();
        System.out.println("Input today's dollar exchange rate:");
        double rate = sc.nextDouble();

        return (double)(currency * rate);
    }

    public static void main(String[] args) {
        System.out.println(convertToDollar());
    }
}
