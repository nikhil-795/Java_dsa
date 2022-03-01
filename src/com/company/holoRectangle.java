package com.company;

import java.util.Scanner;

public class holoRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows :");
        int n=sc.nextInt();
        System.out.println("enter columns :");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1|| i==n || j==m ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
