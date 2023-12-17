import java.util.Scanner;

public class Java14_Presentation_Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many floors has your building?:");
        int buildingHeight = sc.nextInt();
        System.out.println("For how many floors does your elevator go up?:");
        int upFloors = sc.nextInt();
        System.out.println("For how many floors does your elevator go down?:");
        int downFloors = sc.nextInt();
        numberOfLifts(buildingHeight, upFloors, downFloors);
    }

    private static void numberOfLifts(int floor, int stepUp, int stepDown) {
        int intermidiate = 0;
        for (int i = 1; i <= floor; ++i) {
            intermidiate = intermidiate + stepUp - stepDown;
            if ((intermidiate + stepUp) >= floor) {
                ++i;
                System.out.println("You need " + i + " lifts up.");
                return;
            }
        }
    }
}
