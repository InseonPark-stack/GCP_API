package com.example.demo.controller;

import com.example.demo.dto.HotelInfoReservationInfo;
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
    @GetMapping("/rez")
    public ResponseEntity<List<HotelInfoReservationInfo>> getReservationHotelInfo(@RequestParam int no){
        return new ResponseEntity<List<HotelInfoReservationInfo>>(hotelService.getReservationHotelInfo(no), HttpStatus.OK);
    }

    @ApiOperation(value = "취소된 호텔정보 가져오기", response = List.class)
    @GetMapping("/cancel")
    public ResponseEntity<List<HotelInfoReservationInfo>> getCancelHotelInfo(@RequestParam int no){
        return new ResponseEntity<List<HotelInfoReservationInfo>>(hotelService.getCancelInfoByUserNo(no), HttpStatus.OK);
    }

    @ApiOperation(value = "진행중 호텔정보 가져오기", response = List.class)
    @GetMapping("/run")
    public ResponseEntity<List<HotelInfoReservationInfo>> getRunningHotelInfo(@RequestParam int no){
        return new ResponseEntity<List<HotelInfoReservationInfo>>(hotelService.getRunningHotelInfoByUserNo(no), HttpStatus.OK);
    }
}
