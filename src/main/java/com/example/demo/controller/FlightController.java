package com.example.demo.controller;

import com.example.demo.dto.FlightInfoReservationInfo;
import com.example.demo.service.FlightService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @ApiOperation(value = "예약한 비행기정보 가져오기", response = List.class)
    @GetMapping
    public ResponseEntity<List<FlightInfoReservationInfo>> getListUserInfo(@RequestParam int no){
        return new ResponseEntity<List<FlightInfoReservationInfo>>(flightService.getReservationFlightInfoByUserNo(no), HttpStatus.OK);
    }
}
