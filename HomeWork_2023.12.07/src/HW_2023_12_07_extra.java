
//     Task 3 extra
//        Создайте метод, который будет считать сколько денег получает работник в неделю. Метод
//        должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
//
//        Каждый час после 40 считается за полтора.
//        Работник не может работать больше, чем 60 часов в неделю.
//        Работник не может получать меньше 8 долларов в час.


import java.util.Scanner;

public class HW_2023_12_07_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your salary per hour:");
        double salaryPerHour = sc.nextDouble();
        if (salaryPerHour < 8){
            System.out.println("It's illegal to be paid less than 8 dollars. Go to the police.");
            return;
        }
        System.out.println("Input your working hours:");
        int workingHours = sc.nextInt();
        if (workingHours > 60) {
            System.out.println("It's not allowed to work more than 60 hour per week. Go to the police.");
            return;
        }
        calculateSalary(salaryPerHour, workingHours);



    }
    public static double calculateSalary (double salaryPerHour, int workingHours){
        double weeklySalary = 0;

       if (workingHours > 40){
            weeklySalary = (salaryPerHour * 40 + salaryPerHour * (workingHours - 40) * 1.5);
            System.out.println("Your weekly salary is " + weeklySalary + " dollars.");
        }
        else {
            weeklySalary = salaryPerHour * workingHours;
            System.out.println("Your weekly salary is " + weeklySalary + " dollars.");
        }

        return weeklySalary;
    }
}
