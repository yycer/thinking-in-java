package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 11:05
 */
public class Tuple {

    public static <A, B> TwoTuple<A, B> twoTuple(A a, B b){
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> Triple<A, B, C> triple(A a, B b, C c){
        return new Triple<>(a, b, c);
    }

    public static <A, B, C, D> Quadruple<A, B, C, D> quadruple(A a, B b, C c, D d){
        return new Quadruple<>(a, b, c, d);
    }
}
