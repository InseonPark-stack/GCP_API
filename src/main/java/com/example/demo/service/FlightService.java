package com.example.demo.service;

import com.example.demo.dto.FlightInfoReservationInfo;

import java.util.List;

public interface FlightService {
    List<FlightInfoReservationInfo> getReservationFlightInfoByUserNo(int no);
    List<FlightInfoReservationInfo> getRunningFlightInfoByUserNo(int no);
    List<FlightInfoReservationInfo> getCancelReservationFlightInfoByUserNo(int no);
}
