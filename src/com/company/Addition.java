package com.company;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        result = num1 + num2;

        System.out.println(result);
    }
}
