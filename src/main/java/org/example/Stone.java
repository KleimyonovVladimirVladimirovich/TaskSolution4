package org.example;

import java.util.Arrays;

public class Stone {

        public static boolean canPartitionStones(int[] weights) {
            int totalWeight = Arrays.stream(weights).sum();
            int maxWeight = totalWeight / 2;
            boolean[] dp = new boolean[maxWeight + 1];
            dp[0] = true;

            for (int weight : weights) {
                for (int j = maxWeight; j >= weight; j--) {
                    dp[j] = dp[j] || dp[j - weight];
                }
            }

            // Проверка условия
            for (int i = maxWeight; i >=0; i--) {
                if (dp[i]) {
                    int weight2 = totalWeight - i;
                    if (i <= weight2 * 2 && weight2 <= i * 2) {
                        return true;
                    }
                }
            }
            return false;
    }
}
