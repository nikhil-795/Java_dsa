package com.company;

import java.util.Scanner;

public class tableinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=10;i++){
            int t=i*n;
            System.out.println(n+" * "+i+" = "+t);
        }
    }
}
