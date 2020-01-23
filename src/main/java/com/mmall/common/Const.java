package com.mmall.common;

/**
 * <p></p>
 *
 * @author 郑伟坤 (weikun.zheng@ucarinc.com)
 * @version 1.0
 * @data 2020/1/16  15:36
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String USERNAME = "username";

    public static final String EMAIL = "email";

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;  //管理员
    }
}
