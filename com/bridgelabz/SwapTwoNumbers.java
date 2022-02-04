package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number x1 :");
        int x1 = sc.nextInt();
        System.out.println("Enter a Number x2 :");
        int x2 = sc.nextInt();
        int temp;
        System.out.println("Number before swapping:" +x1+" "+x2);
        //Swapping
        temp = x1;
        x1 = x2;
        x2 = temp;
        System.out.println("After swapping:" +x1+" "+x2);
    }
}
