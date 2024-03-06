package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

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

        System.out.println("    숫자 한개를 입력해주세요.");
        int a = scr.nextInt();
        scr.nextLine();
        System.out.println("    사칙연산 부호를 선택해주세요.");
        String s = scr.nextLine();
        switch (s){

            case "+":
                System.out.println("     숫자 한개를 입력해주세요");
                int b = scr.nextInt();
                System.out.println(a + b);






        }



    }
}
