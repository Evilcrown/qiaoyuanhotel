package com.qiaoyuanhotel.hotelshop.dao;

import com.qiaoyuanhotel.hotelshop.modal.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapperDao {
    User selectByPrimaryKey(Integer id);
}
