package com.company;

import java.util.Scanner;

public class numberprimidblank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows : ");
        int n=sc.nextInt();
        System.out.println("staring number");
        int num=sc.nextInt();
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for number
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
    }
}
