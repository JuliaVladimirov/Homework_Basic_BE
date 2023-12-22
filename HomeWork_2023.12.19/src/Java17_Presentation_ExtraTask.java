
//Дан массив размера N-1,
// содержащий только различные целые числа в диапазоне от 1 до N.
// Найдите недостающий элемент.
//        Пример 1:
//        Вход:
//        N = 5
//        А[] = {1,2,3,5}
//        Выход: 4
//
//
//        Пример 2:
//        Вход:
//        N = 10
//        А[] = {6,1,2,8,3,4,7,10,5}
//        Выход: 9


import java.util.Arrays;
import java.util.Scanner;

public class Java17_Presentation_ExtraTask {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("input the max limit value for your array");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n - 1];
        Arrays.fill(arr, 0);

        getArrayFull(arr, n);

        System.out.println(Arrays.toString(arr));
        Integer[] arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        getMissingNumber(arr1, n);
    }

    public static void getArrayFull(Integer[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input the number from 1 till " + n + " The numbers should not repeat.");
            int temp = sc.nextInt();
            if (temp >= 1 && temp <= n) {
                for (int j : arr) {
                    if (j == temp) {
                        System.out.println(" Your number is not unique. Try again.");
                        i--;
                    }
                }
                arr[i] = temp;
            } else {
                System.out.println(" Your number is not in the range. Try again.");
                i--;
            }
        }
    }


    public static void getMissingNumber(Integer[] arr1, int n) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] - i > 1) {
                System.out.println("The missing number is " + (arr1[i] - 1));
                return;
            }
        }
        System.out.println("The missing number is " + n);
    }
}


