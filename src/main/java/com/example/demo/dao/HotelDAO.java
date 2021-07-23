package com.example.demo.dao;

import com.example.demo.dto.HotelInfo;
import com.example.demo.dto.HotelInfoReservationInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelDAO {
    List<HotelInfoReservationInfo> getReservationHotelInfoByUserNo(int no);
}
