package com.excavate.controller;

import com.excavate.returned.Result;
import com.excavate.pojo.ExcavateUser;
import com.excavate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
/**
 *@author weiyan
 *@explain 对基本用户的一些数据操作
 */
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public Result addUser(@RequestBody ExcavateUser user) {
        userService.addUser(user);
        return new Result(true, "添加用户成功！");
    }

    @RequestMapping("/removeUser")
    public Result editUser(@RequestBody @RequestParam(value = "id", required = true) String id) {
        userService.removeUser(id);
        return new Result(true, "删除用户成功！");
    }

    @RequestMapping("/editUser")
    public Result editUser(@RequestBody ExcavateUser user) {
        userService.editUser(user);
        return new Result(true, "编辑用户成功！");
    }

    @RequestMapping("/findUserList")
    public Result findUserList() {
        List<ExcavateUser> excavateUserList = userService.findUserList();
        return new Result(true, "查询全部用户成功！", excavateUserList);
    }

    @RequestMapping("/findByUserId")
    public Result findByUserId(@RequestBody @RequestParam(value = "id", required = true) String id) {
        ExcavateUser excavateUser = userService.findByUserId(id);
        Result result = new Result(true, "查询全部用户成功！");
        result.addParmenterMap("user", excavateUser);
        return result;
    }
}
