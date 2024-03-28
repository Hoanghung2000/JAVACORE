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
        // số hoàn hảo: số hoàn chỉnh-hoàn thiện=hoàn thành, là số nguyên dương
        // mà tổng các ước nguyên dương của nó bằng chính nó
        int sum = 1;
        for (int j = 2; j < num ; j++) {
            if(num % j == 0){
                sum += j;
            }
        }

        if (sum == num){
            System.out.println("đây là số hoàn hảo");
        }else{
            System.out.println("đây k phải là số hoàn hảo");
        }

        // bài 3: cho 2 số a-b, tạo menu 4 lựa chọn: tổng-tích-hiệu-thương

    }
}
