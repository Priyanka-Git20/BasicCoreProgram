package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Exponent");
        int exponent = sc.nextInt();
        for(int i=0;i<= exponent;i++) {
                if (exponent >= 0 && exponent < 31) {
                    int powerOfNumber = (int)Math.pow(2 , i);
                    System.out.println(powerOfNumber);
                }
                else {
                    System.out.println("Enter exponent between 0 to 31");
                }
        }

    }
}

