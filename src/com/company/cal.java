package com.company;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a and b ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation you want to perform\n 1:+ \n,2: -\n,3: *\n,4: /\n,5: % ");
        int z=sc.nextInt();
        int s;
        if(z==1){
             s=a+b;
            System.out.println("add is "+s);
        }else if(z==2){
            s=a-b;
            System.out.println("sub is "+s);
        }else if(z==3){
            s=a*b;
            System.out.println("multi is "+s);
        }else if(z==4){
            s=a/b;
            System.out.println("divide is "+s);
        }else if(z==5){
            s=a%b;
            System.out.println("modulus is "+s);
        }else{
            System.out.println("enter operation does not exist ");
        }
    }
}
