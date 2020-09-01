package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:05
 */
public class GenericClass1 {

    public <T extends Interface1> void genericMethod(T t){
        t.add();
        t.update();
    }
}
