package com.frankie.chapter3;

/**
 * @author: Yao Frankie
 * @date: 2020/8/29 19:29
 */
public class BreakContinueTest {

    public static void main(String[] args) {


        int N = 5;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) continue;
                if (i == 3) break;;
            }
        }
    }
}
