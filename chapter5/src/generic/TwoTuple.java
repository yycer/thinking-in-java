package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 10:31
 */
public class TwoTuple<A, B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString(){
        return "[ " + a + ", " + b + "]";
    }
}
