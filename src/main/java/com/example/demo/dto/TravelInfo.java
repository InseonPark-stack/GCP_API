package com.example.demo.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TravelInfo {

    private int travelNo;
    private int userNo;
    private String travelId;
    private Date travelStartDate;
    private Date travelEndDate;
    private String travelPlace;
    private String travelReservationStatus;
    private int travelTotalPeople;
    private int travelTotalPrice;

}
