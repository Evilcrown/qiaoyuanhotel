package com.qiaoyuanhotel.hotelshop.service;

import com.qiaoyuanhotel.hotelshop.dao.UserMapperDao;
import com.qiaoyuanhotel.hotelshop.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service("userService")
@EnableAutoConfiguration
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public User findUserById(Integer id) {
        return userMapperDao.selectByPrimaryKey(id);
    }
}
