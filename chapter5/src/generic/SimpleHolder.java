package generic;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:30
 */
public class SimpleHolder {
    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    private Object obj;

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.setObj("Item");
        String s = (String) holder.getObj();
    }
}
