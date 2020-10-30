package com.boil.pojo.bo;

/**
 * @Description          前端传递过来的数据封装
 * @author lifuxiang
 * @date 2020/10/30 11:00
 */
public class UserBO {

    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
