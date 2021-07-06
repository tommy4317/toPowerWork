package com.toPower;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int[] exampleArray = new int[] {1,2,3,4,};
        int sum = 0;
        for (int elements : exampleArray) {

            sum += exampleArray[elements-1];
        }
        System.out.println(sum);

        int[] nextArray = toPower(4,2);
        System.out.println(Arrays.toString(nextArray));
    }
    
    public static int[] toPower(int size, int power) {
        int[] expArray = new int[size];
        for (int i = 0; i<expArray.length;i++) {
            expArray[i] = (int) Math.pow(i, power);
        }

        return expArray;

    }
}
