package com.qiaoyuanhotel.hotelshop.dao;

import com.qiaoyuanhotel.hotelshop.modal.Idcard;

public interface IdcardMapper {
    int deleteByPrimaryKey(String idNum);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    Idcard selectByPrimaryKey(String idNum);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}