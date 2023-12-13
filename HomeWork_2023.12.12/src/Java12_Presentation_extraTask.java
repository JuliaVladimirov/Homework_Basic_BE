import java.util.Scanner;

public class Java12_Presentation_extraTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        String stringNumber = sc.nextLine();
        int sum = 0;



        for (int i = 0; i < stringNumber.length(); i++){
            String StringDigit = stringNumber.substring(i,i+1);
            int intDigit = Integer.parseInt(StringDigit);
            sum = sum + intDigit;
        }
        System.out.println("The sum of all digits in this number is: " + sum);
    }
}
