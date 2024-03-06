package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("== 더하기를 하고 싶으면 1을     ==");
        System.out.println("==                          ==");
        System.out.println("==                          ==");
        System.out.println("==                          ==");
        System.out.println("==============================");
        System.out.println("===|1 |========================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");

        Scanner scr = new Scanner(System.in);

        if(scr.nextInt() ==1 ){
            System.out.println("정수 두 개를 입력하세요");
            System.out.print("첫번째 정수 : ");
            int x = scr.nextInt();
            System.out.print("두번째 정수 : ");
            int y = scr.nextInt();

            System.out.println(x+" 와 " + y + " 의 합은 "+ (x+y));

        }

    }
}
