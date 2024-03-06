package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("== 연산부호를 입력하세요        ==");
        System.out.println("==                          ==");
        System.out.println("==                          ==");
        System.out.println("==                          ==");
        System.out.println("==============================");
        System.out.println("===|7|======|8|==============");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");

        System.out.print("사칙연산 부호를 적으세요 : ");
        String symbol= scr.nextLine();
        scr.nextLine();
        System.out.print("첫번째 정수 : ");
        int first = scr.nextInt();
        System.out.print("두번째 정수 : ");
        int second = scr.nextInt();
        switch(symbol){
            case "+" :
                System.out.println(first + second);
                break;
            case "-" :
                System.out.println(first - second);
                break;
            case "*" :
                System.out.println(first * second);
                break;
            case "/":
                try{
                System.out.println(first/second);
                break;}
                catch(ArithmeticException e){
                    System.out.println("두번째 정수가 0이면 안됩니다");
                    break;
                }

            case "%" :
                try{
                    System.out.println(first%second );
                    break;
                }catch(ArithmeticException e){
                    System.out.println("두번째 정수가 0 이면 안됩니다");
                    break;
                }
        }
    }
}
