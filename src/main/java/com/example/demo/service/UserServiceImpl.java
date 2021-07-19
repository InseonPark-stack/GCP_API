package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserInfo> selectUser() {
        return userDAO.selectUser();
    }

    @Override
    public UserInfo selectUserByIdAndPw(String id, String pw) {
        return userDAO.selectUserByIdAndPw(id, pw);
    }

    @Override
    @Transactional
    public boolean insertUser(UserInfo userInfo) {
        return userDAO.insertUser(userInfo) >= 1;
    }

    @Override
    @Transactional
    public boolean updateUser(UserInfo userInfo) {
        return userDAO.updateUser(userInfo) >= 1;
    }

    @Override
    @Transactional
    public boolean deleteUser(UserInfo userInfo) {
        return userDAO.deleteUser(userInfo) >= 1;
    }
}
