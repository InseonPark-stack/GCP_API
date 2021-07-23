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
    @GetMapping("/rez")
    public ResponseEntity<List<FlightInfoReservationInfo>> getListReservationFlightInfo(@RequestParam int no){
        return new ResponseEntity<List<FlightInfoReservationInfo>>(flightService.getReservationFlightInfoByUserNo(no), HttpStatus.OK);
    }

    @ApiOperation(value = "취소된 비행기정보 가져오기", response = List.class)
    @GetMapping("/cancel")
    public ResponseEntity<List<FlightInfoReservationInfo>> getListCancelFlightInfo(@RequestParam int no){
        return new ResponseEntity<List<FlightInfoReservationInfo>>(flightService.getCancelReservationFlightInfoByUserNo(no), HttpStatus.OK);
    }

    @ApiOperation(value = "진행중인 비행기정보 가져오기", response = List.class)
    @GetMapping("/run")
    public ResponseEntity<List<FlightInfoReservationInfo>> getListRunningFlightInfo(@RequestParam int no){
        return new ResponseEntity<List<FlightInfoReservationInfo>>(flightService.getRunningFlightInfoByUserNo(no), HttpStatus.OK);
    }
}
