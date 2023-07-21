import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        task1();
        task2();
        task3();
    }

    public static void task1(){
        String firstName ="Abdul";
        String lasName = "Taibi";

        String name = firstName + " " + lasName;
        System.out.println("task1: " + name);
    }

    public static void task2(){
        double num1 = 25;
        double num2 = 36;
        System.out.println("task2.1: " + (num1 + num2));
        double result = num2/num1;
        System.out.println("task2.2: " + result);
        int num3 = 8;
        System.out.println("task2.3: " + (num3++));
        System.out.println("task2.4: " + num3);
        System.out.println("task2.5: " + ++num3);
    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + ". Please enter the first number you would like to add:");
        int num1 = scanner.nextInt();
        System.out.println("Hi "+ name + ". Please enter the second number you would like to add:");
        int num2 = scanner.nextInt();
        System.out.println("the sum of your two numbers are: "+ (num1 + num2));
    }
}
