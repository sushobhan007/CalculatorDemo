package com.company;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter Time period: ");
        int time = sc.nextInt();
        interestCalculate(principal,rate,time);
    }
    public static double interestCalculate(double principal, double rate, int time){
        double result = (principal * rate * time)/100;
        System.out.println("Your Interest is: "+ result);
        System.out.println("End...");
        return result;
    }
}
