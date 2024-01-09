package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.Constans.*;
import static org.example.Constans.USER_NUM;

public class Util {
    public static Integer[] inputUserData() {

        Integer tempNum;
        Integer[] userNums = new Integer[USER_NUM];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userNums.length; i++) {

            while (true) {
                System.out.println("Input your " + (i + 1) + " number (from 1 to 50)");
                tempNum = sc.nextInt();
                if (tempNum < 1 || tempNum > RANGE) {
                    System.out.println("Your number is out os range. Try again");
                } else {
                    userNums[i] = tempNum;
                    break;
                }

            }
        }
        return userNums;
    }

    public static Integer[] createWinData() {

        Integer[] winNums = new Integer[WIN_NUM];

        for (int i = 0; i < winNums.length; i++) {
            winNums[i] = (int) ((Math.random() * (RANGE - 1)) + 1);
        }
        return winNums;
    }

    public static Integer countWinNum(Integer[] userData, Integer[] winData) {

        Integer winsCount = 0;
        for (int i = 0; i < userData.length; i++) {
            for (int j = 0; j < winData.length; j++) {
                if (userData[i] == winData[j]) {
                    winsCount++;
                }
            }
        }
        return winsCount;
    }

    public static void printResult(Integer[] winNums, Integer[] userNums) {
        System.out.println("User numbers " + Arrays.toString(userNums));
        System.out.println("Win number " + Arrays.toString(winNums));
        System.out.println("Win count number " + countWinNum(userNums, winNums));
    }
}