class MainClass {
    public static void main(String[] args) {

//        1. В методе main инициализировать все примитивные типы и не примитивные типы.
//        2. Вывести их результат в консоль:
//        char: G
//        int: 89
//        byte: 4
//        short: 56
//        float: 4.7333436
//        double: 4.355453532
//        long: 12121
//        Character: G
//        Integer: 89
//        Byte: 4
//        Short: 56
//        Float: 4.7333436
//        Double: 4.355453532
//        Long: 12121

        char ch = 'G';
        System.out.println(ch);
        Character ch1 = ch;
        System.out.println(ch1);

        int in = 89;
        System.out.println(in);
        Integer in1 = in;
        System.out.println(in1);

        byte by = 4;
        System.out.println(by);
        Byte by1 = by;
        System.out.println(by1);

        short sh = 56;
        System.out.println(sh);
        Short sh1 =  sh;
        System.out.println(sh1);

        float fl = 4.7333436f;
        System.out.println(fl);
        Float fl1 = fl;
        System.out.println(fl1);

        double db = 4.355453532;
        System.out.println(db);
        Double db1 = db;
        System.out.println(db1);

        long lg = 12121;
        System.out.println(lg);
        Long lg1 = lg;
        System.out.println(lg1);



//        2. * Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5

        Integer num1 = 345;
        Integer num2 = num1 / 100;
        Integer num3 = num1 /10;
        Integer num4 = num3 % 10;
        Integer num5 = num1 % 10;

        System.out.println("First Digit of the Number 345 is: " + num2);
        System.out.println("Second Digit of the Number 345 is: " + num4);
        System.out.println("Third Digit of the Number 345 is: " + num5);



    }
}