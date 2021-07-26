package com.example.demo.service;

import com.example.demo.dto.TravelInfo;

import java.util.List;

public interface TravelService {
    List<TravelInfo> getTravelInfoByUserNo(int no);
    int updateRezStatus(int no);
    int updateCancelStatus(int no);
}
