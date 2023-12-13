import java.util.Scanner;

public class Java12_Presentation_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = sc.nextInt();
        System.out.println("Input the second number:");
        int num2 = sc.nextInt();
        System.out.println("Input the third number:");
        int num3 = sc.nextInt();
        int max = num1;

        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.println(max + " is the maximum number");

    }
}
