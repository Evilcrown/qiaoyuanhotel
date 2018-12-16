package com.qiaoyuanhotel.hotelshop.service;

import com.qiaoyuanhotel.hotelshop.dao.UserMapper;
import com.qiaoyuanhotel.hotelshop.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service("userService")
@EnableAutoConfiguration
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapperDao;

    @Override
    public User findUserById(Short id) {
        return userMapperDao.selectByPrimaryKey(id);
    }
}
