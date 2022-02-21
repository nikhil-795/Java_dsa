package com.company;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r=sc.nextInt();
        float pi=(float)3.14;
        float area=pi*r*r;
        System.out.println("radius ="+r);
        System.out.println("Area of circle "+area+" cm");
    }
}
