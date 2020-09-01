package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 10:38
 */
public class Quadruple<A, B, C, D> extends Triple<A, B, C> {

    public final D d;

    public Quadruple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString(){
        return "[ " + a + ", " + b + ", " + c + ", " + d + "]";
    }
}
