package com.example.demo.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfo {

    private int userNo;
    private String userId;
    private String userPw;
    private String userNick;
    private String userName;
    private String userGender;
    private String userEmail;
    private String userPhone;
    private Date userBirth;

}
