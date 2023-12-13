public class Java12_Presentation_Task1 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        boolean result = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("I can buy food: " + result);
    }
    public static boolean canBuy(boolean edekaIsOpen, boolean reweIsOpen){
        return (edekaIsOpen || reweIsOpen);
    }
}
