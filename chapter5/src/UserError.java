/**
 * @author: Yao Frankie
 * @date: 2020/8/30 22:11
 */
public enum UserError {
    NAME_IS_INVALID("1001", "用户名无效"),
    PASSWORD_ID_INVALID("1002", "密码错误")
    ;

    UserError(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg  = errorMsg;
    }

    /** 错误码 */
    private String errorCode;
    /** 错误信息描述 */
    private String errorMsg;
}
