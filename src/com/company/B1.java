package com.company;

public class B1 {
    public static void main(String[] args) {
        int arr[] = new int[]{
                2,4,5,7,5,11,0,5,3,1
        };

        int tmp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
