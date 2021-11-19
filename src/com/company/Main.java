package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {4, 6, 1, 8, 3, 7, 9, 0, 10};

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == min) {
                second_min = min;
            } else if (myArray[i] < min) {
                second_min = min;
                min = myArray[i];
            } else if (myArray[i] < second_min) {
                second_min = myArray[i];
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }

}

