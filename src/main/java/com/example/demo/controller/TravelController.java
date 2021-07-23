package com.example.demo.controller;

import com.example.demo.dto.TravelInfo;
import com.example.demo.service.TravelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/travel")
public class TravelController {

    @Autowired
    TravelService travelService;

    @ApiOperation(value = "예약된 여행정보 가져오기", response = List.class)
    @GetMapping("/rez")
    public ResponseEntity<List<TravelInfo>> getReservationTravelInfo(@RequestParam int no){
        return new ResponseEntity<List<TravelInfo>>(travelService.getTravelInfoByUserNo(no), HttpStatus.OK);
    }
}
