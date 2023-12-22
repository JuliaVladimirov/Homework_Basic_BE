//Создайте массив из 5 случайных целых чисел из интервала [10;99]
// Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том,
//является ли массив строго возрастающей последовательностью.
//

import java.util.Arrays;
import java.util.Random;

public class Java17_Presentation_Task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arr));
int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
               num++;
            }
        }
        if (num < arr.length - 1){
            System.out.println("This is not an increasing sequence");
        }else {
            System.out.println("This is an increasing sequence");
        }
    }
}
