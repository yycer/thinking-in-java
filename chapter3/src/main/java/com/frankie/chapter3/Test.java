package com.frankie.chapter3;

/**
 * @author: Yao Frankie
 * @date: 2020/8/29 17:12
 */
public class Test {

    public static void main(String[] args) {

        Alias1 a1 = new Alias1();
        Alias1 a2 = new Alias1();
        a1.balance = 20.33f;
        a2.balance = 1000.88f;
        // 20.33, 1000.88
        System.out.println("a1.balance = " + a1.balance + ", a2.balance = " + a2.balance);
        a1 = a2;
        // 1000.88, 1000.88
        System.out.println("a1.balance = " + a1.balance + ", a2.balance = " + a2.balance);
        a1.balance = 50.12f;
        // 50.12, 50.12
        System.out.println("a1.balance = " + a1.balance + ", a2.balance = " + a2.balance);

    }
}
