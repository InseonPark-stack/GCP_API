package com.example.demo.dao;

import com.example.demo.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {

    List<UserInfo> selectUser();
    UserInfo selectUserByIdAndPw(String id, String pw);
    int insertUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    int deleteUser(UserInfo userInfo);

}
