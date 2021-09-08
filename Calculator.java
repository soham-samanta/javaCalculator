package com.soham;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        System.out.println("Enter x to Terminate!");
        while(true) {
            System.out.print("Enter Operation: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter 2 Numbers: ");
                int a=sc.nextInt();
                int b=sc.nextInt();

                if(ch=='+'){
                    System.out.print("a+b = ");
                    ans=a+b;
                }
                if(ch=='-'){
                    System.out.print("a-b = ");
                    ans=a-b;
                }
                if(ch=='*'){
                    System.out.print("a*b = ");
                    ans=a*b;
                }
                if(ch=='/'){
                    System.out.print("a/b = ");
                    if(b!=0)
                        ans=a/b;
                }
                if(ch=='%'){
                    System.out.print("a%b = ");
                    ans=a%b;
                }

            } else if (ch == 'x' || ch == 'X') {
                break;
            }
            else {
                System.out.println("INVALID try Again!");
            }
            System.out.println(ans);
        }
    }
}
//Soham Samanta Codes
