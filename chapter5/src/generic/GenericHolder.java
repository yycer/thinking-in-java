package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:34
 */
public class GenericHolder<T> {

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    private T obj;

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.setObj("Item");
        String s = holder.getObj();
    }
}
