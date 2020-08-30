package com.frankie.chapter3;

/**
 * @author: Yao Frankie
 * @date: 2020/8/29 19:10
 */
public class ConversionTest {

    public static void main(String[] args) {

        /** 截尾 */
        float  f1 = 0.6F, f2 = 0.2F;
        double d1 = 0.6D, d2 = 0.2D;
        System.out.println("f1 = " + (int) f1); // 0
        System.out.println("f2 = " + (int) f2); // 0
        System.out.println("d1 = " + (int) d1); // 0
        System.out.println("d2 = " + (int) d2); // 0

        System.out.println("----------------");

        /** 舍入 */
        System.out.println("f1 = " + Math.round(f1)); // 1
        System.out.println("f2 = " + Math.round(f2)); // 0
        System.out.println("d1 = " + Math.round(d1)); // 1
        System.out.println("d2 = " + Math.round(d2)); // 0
    }
}
