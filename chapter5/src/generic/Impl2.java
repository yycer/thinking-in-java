package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:04
 */
public class Impl2 implements Interface1 {
    @Override
    public void add() {
        System.out.println("Add 2");
    }

    @Override
    public void update() {
        System.out.println("Update 2");
    }

    private void remove(){
        System.out.println("Remove 2");
    }
}
