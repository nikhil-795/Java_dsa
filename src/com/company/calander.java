package com.company;

import java.util.Scanner;

public class calander {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of month ");
        int month=sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("octmber");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("incorrect entry");
        }
    }
}
