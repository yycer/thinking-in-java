package generic;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 19:34
 */
public class WildCardTest {

    public static void main(String[] args) {
        /** 1. Upper Bounded Wildcards */
//        List<Integer> integers = Arrays.asList(1, 2, 3);
//        System.out.println(avgOfList(integers));
//
//        List<Float> floats = Arrays.asList(1.2f, 2.3f, 3.5f);
//        System.out.println(avgOfList(floats));

        /** 2. Unbound Wildcards */
        List<Integer> integers = Arrays.asList(1, 2, 3);
        printList(integers);

        List<String> names = Arrays.asList("yyc", "asan", "pangzi");
        printList(names);
    }

    public static double avgOfList(List<? extends Number> list){
        double ans = 0.0d;
        for (Number n: list){
            ans += n.doubleValue();
        }
        ans /= list.size();
        return ans;
    }

    public static void printList(List<?> list){
        for (Object o: list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
