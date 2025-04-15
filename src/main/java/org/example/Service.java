package org.example;

import java.util.Arrays;

// Задача 4 ---> Клеймёнов Владимир Владимирович ---> 209 группа.

public class Service extends Stone {

    public static void main(String[] args) {
        int[] weights = {3, 1, 4, 2, 2}; // Возможно разбиение с условием еще и при весах {10, 20}, {10,30}.
        boolean isPartition = canPartitionStones(weights);
        if (isPartition) {
            System.out.println("Камни " + Arrays.toString(weights) + " могут разбиться на две кучи с заданным условием.");
        } else {
            System.out.println("Камни " + Arrays.toString(weights) + " не могут разбиться на две кучи с заданным условием.");
        }

    }
}
