package com.example.demo.service;

import com.example.demo.dto.HotelInfoReservationInfo;

import java.util.List;

public interface HotelService {
    List<HotelInfoReservationInfo> getReservationHotelInfo(int no);
    List<HotelInfoReservationInfo> getRunningHotelInfoByUserNo(int no);
    List<HotelInfoReservationInfo> getCancelInfoByUserNo(int no);
}
