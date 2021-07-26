package com.example.demo.service;

import com.example.demo.dao.TravelDAO;
import com.example.demo.dto.TravelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService{

    @Autowired
    TravelDAO travelDAO;

    @Override
    public List<TravelInfo> getTravelInfoByUserNo(int no) {
        return travelDAO.getTravelInfoByUserNo(no);
    }

    @Override
    public int updateRezStatus(int no) {
        return travelDAO.updateRezStatus(no);
    }

    @Override
    public int updateCancelStatus(int no) {
        return travelDAO.updateCancelStatus(no);
    }
}
