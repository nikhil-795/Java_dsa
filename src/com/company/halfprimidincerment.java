package com.company;

import java.util.Scanner;

public class halfprimidincerment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows ");
        int n=sc.nextInt();
        System.out.println("enter first number to be started ");
        int num=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
