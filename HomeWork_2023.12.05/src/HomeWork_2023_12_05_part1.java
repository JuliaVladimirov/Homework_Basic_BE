import java.util.Scanner;

public class HomeWork_2023_12_05_part1 {

    public static String readInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String word = sc.nextLine();

        if (word.isEmpty()) {
            System.out.println("You have not input any word.");
            System.exit(1);
        } else if ((word.length() % 2) == 0) {
            return word;
        } else {
            System.out.println("You have input a word with odd number of " +
                    "characters.");
            System.exit(1);
        }
        return "";
    }

    public static void main(String[] args) {

        String firstWord = readInput("Input a word with even number of characters:");
        String secondWord = readInput("Input another word with even number of " +
                "characters:");
        String firstPart = firstWord.substring(0, (firstWord.length() / 2));
        String secondPart = secondWord.substring(secondWord.length() / 2);
        System.out.println("The new combined word is: " + firstPart + secondPart);
    }

}
