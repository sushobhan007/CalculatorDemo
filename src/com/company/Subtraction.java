package com.company;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2)
            result = num1 - num2;
        else
            result = num2 - num1;

        System.out.println(result); 
    }
}
