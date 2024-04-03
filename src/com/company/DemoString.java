package com.company;

import java.util.StringTokenizer;

public class DemoString {
    public static void main(String[] args) {
        String name = "Hung";
        String address = new String("Thai Binh");

        StringTokenizer stringTokenizer = new StringTokenizer("A B C");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println("tách chuỗi: " + stringTokenizer.nextToken());
        }

        StringTokenizer stringTokenizer1 = new StringTokenizer("A,Bmmm,C", ",");
        while (stringTokenizer1.hasMoreElements()) {
            System.out.println("tách chuỗi ',': " + stringTokenizer1.nextToken());
        }

        StringTokenizer stringTokenizer2 = new StringTokenizer("Ann,Bmm,Cnn", ",", true);
        while (stringTokenizer2.hasMoreElements()) {
            System.out.println("tách chuỗi: " + stringTokenizer2.nextToken());
        }
    }
}