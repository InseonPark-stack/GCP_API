package com.example.demo.controller;

import com.example.demo.dto.HotelInfo;
import com.example.demo.service.HotelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @ApiOperation(value = "예약한 호텔정보 가져오기", response = List.class)
    @GetMapping
    public ResponseEntity<List<HotelInfo>> getListUserInfo(@RequestParam int no){
        return new ResponseEntity<List<HotelInfo>>(hotelService.getReservationHotelInfo(no), HttpStatus.OK);
    }
}
