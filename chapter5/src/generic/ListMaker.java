package generic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/9/1 13:24
 */
public class ListMaker<T> {

    public List<T> create(){
        return new LinkedList<>();
    }
}
