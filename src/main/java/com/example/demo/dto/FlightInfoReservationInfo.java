package com.example.demo.dto;

import lombok.*;

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
    private String rezFlightStartDate;
    private String rezFlightEndDate;
    private String rezFlightStartPlace;
    private String rezFlightEndPlace;
}
