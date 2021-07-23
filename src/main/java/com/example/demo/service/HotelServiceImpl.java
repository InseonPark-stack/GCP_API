package com.example.demo.service;

import com.example.demo.dao.HotelDAO;
import com.example.demo.dto.HotelInfoReservationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelDAO hotelDAO;

    @Override
    public List<HotelInfoReservationInfo> getReservationHotelInfo(int no) {
        return hotelDAO.getReservationHotelInfoByUserNo(no);
    }

    @Override
    public List<HotelInfoReservationInfo> getRunningHotelInfoByUserNo(int no) {
        return hotelDAO.getRunningHotelInfoByUserNo(no);
    }

    @Override
    public List<HotelInfoReservationInfo> getCancelInfoByUserNo(int no) {
        return hotelDAO.getCancelInfoByUserNo(no);
    }
}
