package com.bridgelabz;

import java.util.Scanner;

public class ComputeQuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a dividend :");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor :");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;
        System.out.println("Quotient =" + quotient);
        System.out.println("Reminder =" + reminder);
    }
}
