package com.excavate.service;

import com.excavate.pojo.ExcavateUser;

import java.util.List;

/**
 * @author misterWei
 * @create 2019年02月16号:22点38分
 * @mailbox mynameisweiyan@gmail.com
 */
public interface UserService {
    public void addUser(ExcavateUser user);

    void removeUser(String id);

    void editUser(ExcavateUser user);

    List<ExcavateUser> findUserList();

    ExcavateUser findByUserId(String id);
}
