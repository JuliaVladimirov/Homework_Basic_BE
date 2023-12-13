public class Java11_Presentation_extraTask {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = walkOrNot(isWeekend, isRain);


        System.out.println(canWalk);
    }

    public static boolean walkOrNot(boolean isWeekend, boolean isRain) {

        if (isWeekend && !isRain) {
            return true;
        }
        return false;
    }

}