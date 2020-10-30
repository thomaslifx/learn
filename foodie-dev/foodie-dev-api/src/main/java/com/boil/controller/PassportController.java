package com.boil.controller;

import com.boil.service.UserService;
import com.boil.utils.BoilJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author lifuxiang
 * @Description
 * @date 2020/10/30 9:25
 */
@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExit")
    public BoilJSONResult usernameIsExit(@RequestParam String username) {
        // 1.判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            return BoilJSONResult.errorMsg("用户名不能为空");
        }

        // 2.查找注册的用户是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist) {
            return BoilJSONResult.errorMsg("用户名已经存在");
        }

        // 3. 请求成功，用户名没有重复
        return BoilJSONResult.ok();

    }


    @PostMapping("/register")
    public BoilJSONResult register() {
        return BoilJSONResult.ok();
    }


    public static void main(String[] args) {
        UUID uuid = new UUID(32,32);
        System.out.println(uuid);
    }
}
