package com.qiaoyuanhotel.hotelshop.dao;

import com.qiaoyuanhotel.hotelshop.modal.Nation;

public interface NationMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}