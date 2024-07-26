package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        test1 app = new test1();

        System.out.println("=============================");
        System.out.println("==                         ==");
        System.out.println("==                         ==");
        System.out.println("==                         ==");
        System.out.println("==                         ==");
        System.out.println("=============================");
        System.out.println("===| 7 |====| 8 |====| 9 |===");
        System.out.println("===| 4 |====| 5 |====| 6 |===");
        System.out.println("===| 1 |====| 2 |====| 3 |===");
        System.out.println("==============================");

        System.out.print("첫번째 정수 : ");
        int first = scr.nextInt();

        scr.nextLine();
        System.out.print("사칙연산 입력");
        String symbol = scr.nextLine();

        System.out.print("두번째 정수 : ");
        int second = scr.nextInt();
        switch (symbol) {
            case "+":
                app.a();
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;


            case "/":
                try {
                    System.out.println(first / second);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("두번째 정수가 0이면 안됩니다");
                    break;
                }

            case "%":
                try {
                    System.out.println(first % second);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("두번째 정수가 0 이면 안됩니다");
                    break;
                } default:
                System.out.println("잘못 입력했습니다");


        }
    }
    public void a(){
        Scanner sc = new Scanner(System.in);
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();

    }


}





