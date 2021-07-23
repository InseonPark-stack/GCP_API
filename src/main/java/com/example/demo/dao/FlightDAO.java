package com.example.demo.dao;

import com.example.demo.dto.FlightInfoReservationInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FlightDAO {
    List<FlightInfoReservationInfo> getReservationFlightInfoByUserNo(int no);
}
