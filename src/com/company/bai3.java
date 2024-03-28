package com.company;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int a, b, choose = 0;
        Scanner scanner = new Scanner(System.in);
        float c;
        while (choose <= 4){
            System.out.println("nhap 2 so a va b: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("vui long chon: ");
            System.out.println("1. tong hai so");
            System.out.println("2. hieu hai so");
            System.out.println("3. tich hai so");
            System.out.println("4. thuong hai so");
            System.out.println("thoat chuong trinh - any key");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("tong 2 so la "+ (a+b));
                    break;
                case 2:
                    System.out.println("hieu 2 so la "+ (a-b));
                    break;
                case 3:
                    System.out.println("tich 2 so la "+ (a*b));
                    break;
                case 4:
                    c = (float) (a / b);
                    System.out.println("thuong 2 so la "+ c);
                    break;
                default:
                    System.exit(1);
            }

        }
    }
}
