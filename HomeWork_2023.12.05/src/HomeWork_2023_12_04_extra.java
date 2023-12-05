//1. Напишите программу, которая вычисляет, сколько лишних калорий будет,
//   если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//2. Чтобы решить эту проблему, предположим, что каждый квадратный
//   сантиметр пиццы содержит 40 калорий.

public class HomeWork_2023_12_04_extra {
    static double piNumber = Math.PI;

    public static void main(String[] args) {
        int rSmallPizza = 24;
        int dSmallPizza = rSmallPizza / 2;
        int rBigPizza = 28;
        int dBigPizza = rBigPizza / 2;
        int oneSquareCmCalories = 40;

        double squareSmallPizza = piNumber * dSmallPizza * dSmallPizza;
        double squareBigPizza = piNumber * dBigPizza * dBigPizza;
        double squareDifference = squareBigPizza - squareSmallPizza;
        double extraCalories = squareDifference * oneSquareCmCalories;
        System.out.println("You have eaten " + extraCalories + " extra calories!");
    }
}