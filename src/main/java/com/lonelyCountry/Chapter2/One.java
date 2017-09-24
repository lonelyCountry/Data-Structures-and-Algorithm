package com.lonelyCountry.Chapter2;

/**
 * Created By YeFan on 2017/9/24.
 */

/**
 * 最大子序列和问题
 */
public class One {
    /**
     * 算法一
     * @param arr
     * @return
     */
    public static int maxSubSum1(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += arr[k];
                    if (thisSum > maxSum) {
                        maxSum = thisSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static int maxSubSum2(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int thisSum = 0;
            for (int j = i; j < arr.length; j++) {
                thisSum += arr[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
}
