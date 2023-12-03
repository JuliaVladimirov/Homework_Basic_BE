
//Напишите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день <…….. !>».
//Улучшите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день  <…….. !>».
//«Ваше имя начинается с символа <.> и заканчивается на символ <.>».

import java.util.Scanner;

public class HomeWork_2023_11_30_part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Name");
        String name = sc.nextLine();
        System.out.println("Good Day " + name + "!");
        System.out.println("Your name starts with " +
                name.charAt(0) + " and ends with " +
                name.charAt(name.length() - 1));
    }
}
