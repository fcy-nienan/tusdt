package com.assetManage.tusdt.model.bo;

import com.assetManage.tusdt.model.User;

/**
 * Description:
 * Author: xxw
 * Date: 2020-04-24
 * Time: 14:17
 */
public class UserLoginBO {

    private String code;

    private String token;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
