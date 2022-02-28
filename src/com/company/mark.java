package com.company;

import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter the marks of student ");
            int mark = sc.nextInt();
            if (mark >= 90) {
                System.out.println("This is good");
            } else if (89 >= mark && mark >= 60) {
                System.out.println("this is also good");
            } else if (59 >= mark && mark >= 0) {
                System.out.println("this is good as well");}
            else{
                    System.out.println("invalid");
                }

                System.out.println("enter either 1 or 0");
                n = sc.nextInt();
            }
        while (n == 1);
    }
}
