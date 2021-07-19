package com.example.demo.service;

import com.example.demo.dto.UserInfo;

import java.util.List;

public interface UserService{

    List<UserInfo> selectUser();

    UserInfo selectUserByIdAndPw(String id, String pw);

    boolean insertUser(UserInfo userInfo);

    boolean updateUser(UserInfo userInfo);

    boolean deleteUser(UserInfo userInfo);
}
