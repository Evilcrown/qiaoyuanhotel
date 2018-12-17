package com.qiaoyuanhotel.hotelshop.dao;

import com.qiaoyuanhotel.hotelshop.modal.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(Short roomNum);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Short roomNum);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}