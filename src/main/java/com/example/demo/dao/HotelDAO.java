package com.example.demo.dao;

import com.example.demo.dto.HotelInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelDAO {
    List<HotelInfo> getReservationHotelInfo(int no);
}
