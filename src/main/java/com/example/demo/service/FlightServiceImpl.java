package com.example.demo.service;

import com.example.demo.dao.FlightDAO;
import com.example.demo.dto.FlightInfoReservationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    FlightDAO flightDAO;


    @Override
    public List<FlightInfoReservationInfo> getReservationFlightInfoByUserNo(int no) {
        return flightDAO.getReservationFlightInfoByUserNo(no);
    }
}
