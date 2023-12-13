import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        final int a = 4;
        final int b = 10;
        final int c = 40;
        final int d = 89;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 0 to 100");
        int num = sc.nextInt();

//Option 1
        if ((num == a) || (num == b) || (num == c) || (num == d)) {
            System.out.println("Congratulations!!! Your number " + num + " won!");
        } else {
            System.out.println("Sorry, your number didn't win. Maybe next time...");
        }


//Option 2
        switch (num) {
            case a:
            case b:
            case c:
            case d:
                System.out.println("Congratulations!!! Your number " + num + " won!");
                break;
            default:
                System.out.println("Sorry, your number didn't win. Maybe next time...");
        }
//Option 3
        String result = num == a || num == b || num == c || num == d ? "Congratulations!!! Your number " + num + " won!" : "Sorry, your number didn't win. Maybe next time...";
        System.out.println(result);
    }
}
