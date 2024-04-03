package com.company;

public class B2 {
    public static void main(String[] args) {
        String name = "Hung";
        String token = "X";
        token = token.replace("X", "XXXXXXXXXX");
        token = token.replace("X", "XXXXXXXXXX");

        token= token.replace("X", name);

        System.out.println(token);
    }
}
