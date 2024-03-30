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
        String[] name = new String[]{
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

        /*for (int age: ages
        ) {
            System.out.println(age);
        }*/

        //multidimensional array
        //cach 1
        int[][] matrixAge = new int[2][3];
        matrixAge[0][0] = 1;
        matrixAge[0][1] = 12;
        matrixAge[0][2] = 4;

        matrixAge[1][0] = 2;
        matrixAge[1][1] = 7;
        matrixAge[1][2] = 6;

        for (int i = 0; i < matrixAge.length ; i++) {
            for (int j = 0; j < matrixAge[i].length; j++) {
                System.out.printf(matrixAge[i][j] + " ");
            }
            System.out.println(" ");
        }

        //cach 2
        String[][] names = new  String[][]{
                {"Linh", "lee", "nam"},
                {"Tu", "Ngoc", "Duong"}
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.printf(names[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

