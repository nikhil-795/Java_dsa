package com.company;

import java.util.Scanner;

public class halfprimidonesTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){  //even
                    System.out.print("1");
                }else {  //odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
