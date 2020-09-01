package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:04
 */
public class Impl1 implements Interface1 {
    @Override
    public void add() {
        System.out.println("Add 1");
    }

    @Override
    public void update() {
        System.out.println("Update 1");
    }

    private void remove(){
        System.out.println("Remove 1");
    }
}
