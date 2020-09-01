package generic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 10:58
 */
public class GenericVarargs {

    public static <T> List<T> buildList(T... args){
        return new LinkedList<>(Arrays.asList(args));
    }

    public static void main(String[] args) {

        List<String> ans = buildList("yyc", "frankie");
        List<String> ans2 = buildList("abcdef".split(""));
        System.out.println(ans);
        System.out.println(ans2);
    }
}
