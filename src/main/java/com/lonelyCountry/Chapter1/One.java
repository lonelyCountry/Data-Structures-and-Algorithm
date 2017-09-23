package com.lonelyCountry.Chapter1;

/**
 * Created By YeFan on 2017/9/24.
 */
public class One {
    /**
     * 单独打印数字的所有位数
     * @param n
     */
    public static void Function1(int n) {
        if (n >= 10) {
            Function1(n / 10);
        }
        System.out.println(n % 10);
    }

}
