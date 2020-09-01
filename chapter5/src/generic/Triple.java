package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 10:35
 */
public class Triple<A, B, C> extends TwoTuple<A, B>{

    public final C c;

    public Triple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString(){
        return "[ " + a + ", " + b + ", " + c + "]";
    }
}
