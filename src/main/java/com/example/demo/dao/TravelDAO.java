package com.example.demo.dao;

import com.example.demo.dto.TravelInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TravelDAO {
    List<TravelInfo> getTravelInfoByUserNo(int no);
}
