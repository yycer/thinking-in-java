/**
 * @author: Yao Frankie
 * @date: 2020/8/31 14:33
 */
public enum Currency {

    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    private int val;
    Currency(int val){
        this.val = val;
    }
}
