package com.company;

import java.util.Scanner;

public class invertedHalfparimeid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of lines ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // for space
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");}

            // for star
            for(int j=1;j<=i;j++){
            System.out.print("*");}
            System.out.println();
        }
    }
}
