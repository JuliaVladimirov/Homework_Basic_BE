import java.util.Scanner;

public class Java12_Presentation_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year:");
        int year = sc.nextInt();
        boolean isLeap;


        if ((year % 4 == 0) && (year % 100 != 0)){
            isLeap = true;
        } else if ((year % 100 == 0) && (year % 400 == 0)){
            isLeap = true;
        }else {
            isLeap = false;
        }

        System.out.println("This year is leap: " + isLeap);


    }
}
