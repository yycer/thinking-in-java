package generic;

import java.util.LinkedList;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 12:49
 */
public class ErasureTest {

    public static void main(String[] args) {


        Class<? extends LinkedList> c1 = new LinkedList<String>().getClass();
        Class<? extends LinkedList> c2 = new LinkedList<Integer>().getClass();
        System.out.println(c1);
        System.out.println(c1 == c2);
    }
}
