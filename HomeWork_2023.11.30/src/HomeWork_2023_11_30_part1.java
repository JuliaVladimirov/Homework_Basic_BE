//1. Создайте строку через new - I study Basic Java!
//2. Напишите метод, который принимает в качестве параметра строку, передайте в
//этот метод строку, которую создали в п.1
//3. Распечатать пред-последний символ строки. Используем метод String.charAt().
//4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
//String.contains().
//5. Вырезать строку Java c помощью метода String.substring().
//6. Заменить все символы “а” на “о”.
//7. Преобразуйте строку к верхнему регистру.
//8. Преобразуйте строку к нижнему регистру.

public class HomeWork_2023_11_30_part1 {


    public static void mySentence(String sentence) {
        System.out.println(sentence);
        System.out.println("The second-to-last symbol of the sentence is:  " +
                sentence.charAt(sentence.length() - 2));
        System.out.println("Does your sentence contain the word \"Java\" ?:  " +
                sentence.contains("Java"));
        System.out.println("I cut the following word from the sentence: " +
                sentence.substring(14, sentence.length() - 1));
        System.out.println("All \"a\" symbols in this sentence are changed to \"o\" symbols: " +
                sentence.replace('a', 'o'));
        System.out.println("The sentence is printed in lower case: " +
                sentence.toLowerCase());
        System.out.println("The sentence is printed in upper case: " +
                sentence.toUpperCase());

    }

    public static void main(String[] args) {
        String sentence = new String("I study Basic Java!");
        mySentence(sentence);
    }
}

