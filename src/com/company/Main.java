package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 2; i < num/2; i++) {
            flag = false;
            break;
        }

        if (flag == true){
            System.out.println("đây là số nguyên tố!");
        }
        else{
            System.out.println("đây không là số nguyên tố!");
        }

    }
}
