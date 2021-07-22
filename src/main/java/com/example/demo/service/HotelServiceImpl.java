package com.example.demo.service;

import com.example.demo.dao.HotelDAO;
import com.example.demo.dto.HotelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelDAO hotelDAO;

    @Override
    public List<HotelInfo> getReservationHotelInfo(int no) {
        return hotelDAO.getReservationHotelInfo(no);
    }
}
