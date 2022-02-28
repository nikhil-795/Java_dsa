package com.company;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print even number upto :");
         int n=sc.nextInt();
         for(int i=0;i<=n;i=i+2){
             System.out.println(i);
         }
    }
}
