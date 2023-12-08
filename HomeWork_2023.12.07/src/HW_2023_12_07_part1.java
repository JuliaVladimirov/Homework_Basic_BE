//      Hometask 1
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
//        записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.

import java.util.Scanner;

public class HW_2023_12_07_part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        double m = sc.nextDouble();
        System.out.println("Input another number");
        double n = sc.nextDouble();

        if ((m > 10) && (n > 10) && (m < n)) {
            System.out.println("Your first number " + m + " is more close to 10");
        } else if ((m > 10) && (n > 10) && (m > n)) {
            System.out.println("Your second number " + n + " is more close to 10");
        }else if ((m < 10) && (n < 10) && (m > n )){
            System.out.println("Your first number " + m + " is more close to 10");
        }else {
            System.out.println("Your second number " + n + " is more close to 10");
        }

    }
}