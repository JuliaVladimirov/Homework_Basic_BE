public class Task3 {
    public static void main(String[] args) {
        String spaceInitial = "         ";
        String spaceActual;
        for (int i = 0; i < spaceInitial.length(); i++) {
            spaceActual = spaceInitial.substring(0,spaceInitial.length() - i);
            System.out.println(spaceActual + "*");
        }
        System.out.println("*");
    }
}
