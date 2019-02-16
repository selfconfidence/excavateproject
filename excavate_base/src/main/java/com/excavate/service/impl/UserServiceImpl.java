package com.excavate.service.impl;

import com.excavate.mapper.ExcavateUserMapper;
import com.excavate.pojo.ExcavateUser;
import com.excavate.service.UserService;
import com.excavate.utils.Base64Utils;
import com.excavate.utils.IdWorker;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author misterWei
 * @create 2019年02月16号:22点38分
 * @mailbox mynameisweiyan@gmail.com
 */
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {
    @Autowired
    ExcavateUserMapper excavateUserMapper;
    @Autowired
    private IdWorker iDWorker;
    @Override
    public void addUser(ExcavateUser user) {
        user.setId(iDWorker.nextId().toString());
    }

    @Override
    public void removeUser(String id) {
        excavateUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void editUser(ExcavateUser user) {
       excavateUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<ExcavateUser> findUserList() {
        return excavateUserMapper.selectByExample(null);
    }

    @Override
    public ExcavateUser findByUserId(String id) {
        return excavateUserMapper.selectByPrimaryKey(id);
    }
}
