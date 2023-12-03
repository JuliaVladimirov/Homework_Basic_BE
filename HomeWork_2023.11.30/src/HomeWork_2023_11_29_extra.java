public class HomeWork_2023_11_29_extra {
    public static void main(String[] args) {

//Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
//Объявите переменные int и double сохраните полученную сумму в эти переменные,
//разделив результат на 10.
//Вы получили среднее арифметическое этих чисел в двух типах int и double.
//Распечатайте через println.
//Проанализируйте результат.

        int num = 0, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9;
        int sum = num + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
        int average = sum / 10;
        System.out.println("The average in the \"int\" variable is: " + average);
        double average1 = (double) sum / 10;
        System.out.println("The average in the \"double\" variable is: " + average1);
    }
}