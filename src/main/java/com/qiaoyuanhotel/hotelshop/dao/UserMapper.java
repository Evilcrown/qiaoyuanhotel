package com.qiaoyuanhotel.hotelshop.dao;

import com.qiaoyuanhotel.hotelshop.modal.User;

public interface UserMapper {
    int deleteByPrimaryKey(Short id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}