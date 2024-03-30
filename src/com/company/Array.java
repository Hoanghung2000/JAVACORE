package com.company;

public class Array {
    public static void main(String[] args) {
        // khai bao mang
        // cach 1
        int[] ages = new int[10];
        ages[0] = 1;
        ages[2] = 2;
        //null

        // cach 2
        String[] names = new String[]{
                "hung",
                "hoang",
                "tran"
        };
        /*System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(name[3]);*/

        /*for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }*/

        for (int age: ages
        ) {
            System.out.println(age);
        }
    }
}

