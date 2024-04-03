package com.company;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        String[] swearWord = new String[]{
                "fuck",
                "mother fuck"
        };

        String replacement = "***";
        String input = null;

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        for (int i = 0; i < swearWord.length; i++) {
            input = input.replace(swearWord[i], replacement);
        }

        System.out.println("chuỗi sau khi xử lý: " + input);
    }
}
