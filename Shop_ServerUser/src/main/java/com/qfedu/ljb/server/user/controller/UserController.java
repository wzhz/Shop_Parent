package com.qfedu.ljb.server.user.controller;

import com.qfedu.common.exception.UserException;
import com.qfedu.common.vo.R;
import com.qfedu.ljb.entity.User;
import com.qfedu.ljb.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/6/12 16:45
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //查询
    @GetMapping("user/all.do")
    public R all(){
        return userService.all();
    }
    //新增
    @PostMapping("user/save.do")
    public R save(@RequestBody User user) throws UserException {
        return userService.save(user);
    }
}
