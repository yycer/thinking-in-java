package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 12:57
 */
public class Manipulator<T extends HasF> {

    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate(){
        obj.f();
    }
}
