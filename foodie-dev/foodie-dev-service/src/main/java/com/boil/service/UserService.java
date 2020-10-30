package com.boil.service;

import com.boil.pojo.Users;
import com.boil.pojo.bo.UserBO;

/**
 * @author lifuxiang
 * @Description
 * @date 2020/10/30 9:13
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     * @param username
     * @return
     */
    boolean queryUsernameIsExist(String username);

    Users createUser(UserBO userBO);
}
