package com.example.demo.service;

import com.example.demo.dto.HotelInfo;

import java.util.List;

public interface HotelService {

    List<HotelInfo> getReservationHotelInfo(int no);
}
