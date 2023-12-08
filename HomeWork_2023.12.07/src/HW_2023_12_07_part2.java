//      Task 2
//        Есть устройство, на табло которого показывается количество секунд, оставшихся до конца
//        рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800»
//        (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а
//        когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//        Некоторые сотрудники не умеют оценивать остаток рабочего дня в секундах.
//        Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы
//        с информацией о том, сколько полных часов осталось до конца рабочего дня.
//        Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//
//        Объяснение: в переменную n должно записываться случайное (на время тестирования
//        программы) целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран
//        (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна
//        выводиться фраза о количестве полных часов, содержащихся в n секундах.


import java.util.Scanner;

public class HW_2023_12_07_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many seconds you see on the information table (from 0 to 28800):");
        int sec = sc.nextInt();
        int hour = sec / 3600;
        if ((sec < 0) || (sec > 28800)){
            System.out.println("You entered wrong number.");
        } else if (sec > 3600){
            System.out.println(sec + " seconds left till the end of the working day");
            System.out.println(hour + " hours left till the end of the working day");
        }else {
            System.out.println(sec + " seconds left till the end of the working day");
            System.out.println("Less than an hour left till the end of the working day");
        }

    }
}
