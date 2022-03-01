package com.company;

import java.util.Scanner;

public class solidrombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //for blank space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
