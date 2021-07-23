package com.example.demo.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightInfoReservationInfo {
    private int flightNo;
    private String flightName;
    private String flightAirline;
    private String flightBaggage;
    private Date rezFlightStartDate;
    private Date rezFlightEndDate;
    private String rezFlightStartPlace;
    private String rezFlightEndPlace;
}
