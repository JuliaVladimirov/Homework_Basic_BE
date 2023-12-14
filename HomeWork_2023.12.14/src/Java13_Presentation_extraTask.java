import java.util.Scanner;

public class Java13_Presentation_extraTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number for height:");
        int height = sc.nextInt();
        System.out.println("Input a number for width:");
        int width = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}