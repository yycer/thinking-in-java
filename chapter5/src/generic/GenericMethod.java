package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 10:48
 */
public class GenericMethod {

    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public <A, B, C> void f(A a, B b, C c){
        System.out.println("A = " + a.getClass().getName());
        System.out.println("B = " + b.getClass().getName());
        System.out.println("C = " + c.getClass().getName());
    }

    public <A, B, C> void f(String name, A a, B b, C c){
        System.out.println("name = " + name);
        System.out.println("A = " + a.getClass().getName());
        System.out.println("B = " + b.getClass().getName());
        System.out.println("C = " + c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
//        gm.f(10);
//        gm.f("yyc");
//        gm.f(10.2f);
//        gm.f(BigDecimal.valueOf(10.2));
        gm.f("frankie", 10, "yyc", 10.2d);
    }
}
