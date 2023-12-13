import java.util.Scanner;

public class Wordtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите предложение");
        String sentence = sc.nextLine();
        char firstLetter = sentence.charAt(0);
        char lastLetter = sentence.charAt(sentence.length() - 1);

        if (sentence.contains("а")) {
            System.out.println("В Вашем предложении была буква 'a'.");
        }

        if (sentence.contains("арбуз")) {
            System.out.println("В Вашем предложении было слово 'арбуз'.");
        }


        System.out.println("Напишите еще одно предложение");
        String sentence1 = sc.nextLine();
        char firstLetter1 = sentence1.charAt(0);
        char lastLetter1 = sentence1.charAt(sentence1.length() - 1);
        if (firstLetter == firstLetter1) {
            System.out.println("В Ваших двух предложениях совпадают первые символы");
        }
        if (lastLetter == lastLetter1) {
            System.out.println("В Ваших двух предложениях совпадают последние символы");
        }
    }
}
