import java.util.Scanner;

public class Java14_Presentation_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how much money you have on your account:");
        int totalInBank = sc.nextInt();
        int j = 0;
            int sumAllowed;
            for (int i = totalInBank - 1; i > 0; i--) {
                if (totalInBank % i == 0) {
                    sumAllowed = i;
                    totalInBank -= sumAllowed;
                    j++;
                    i = totalInBank;
                }
        }
            j += 1;
            System.out.println("You need " + j + " days, to pull out all your money.");
    }
}
