package generic;

import java.lang.reflect.Array;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:21
 */
public class ArrayMaker<T> {

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    private Class<T> kind;

    @SuppressWarnings("unchecked")
    public T[] create(int size){
        // Unchecked cast: 'java.lang.Object' to 'T[]'
        return (T[]) Array.newInstance(kind, size);
    }

}
