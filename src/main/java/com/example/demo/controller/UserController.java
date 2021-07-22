package com.example.demo.controller;

import com.example.demo.dto.UserInfo;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;


    @ApiOperation(value = "회원정보 리스트 가져오기", response = List.class)
    @GetMapping
    public ResponseEntity<List<UserInfo>> getListUserInfo(){
        return new ResponseEntity<List<UserInfo>>(userServiceImpl.selectUser(), HttpStatus.OK);
    }

    @ApiOperation(value = "로그인할때 사용", response = UserInfo.class)
    @GetMapping("/login")
    public ResponseEntity<UserInfo> getUserLogin(@RequestParam String id, @RequestParam String pw){
        return new ResponseEntity<UserInfo>(userServiceImpl.selectUserByIdAndPw(id, pw), HttpStatus.OK);
    }

    @ApiOperation(value = "아이디 중복 확인", response = String.class)
    @GetMapping("/checkId")
    public ResponseEntity<String> checkId(@RequestParam String id){
        String temp = "중복 아님";
        if(userServiceImpl.selectUserById(id) != null) {
            temp = "중복";
        }
        return new ResponseEntity<String>(temp, HttpStatus.OK);
    }

    @ApiOperation(value = "닉네임 중복 확인", response = String.class)
    @GetMapping("/checkNick")
    public ResponseEntity<String> chekcInck(@RequestParam String nick){
        String temp = "중복 아님";
        if(userServiceImpl.selectUserByNick(nick) != null) {
            temp = "중복";
        }
        return new ResponseEntity<String>(temp, HttpStatus.OK);
    }

    @ApiOperation(value = "회원정보 리스트 가져오기", response = String.class)
    @PostMapping
    public ResponseEntity<String> insertUser(@RequestBody UserInfo userInfo){
        return userServiceImpl.insertUser(userInfo) ? new ResponseEntity<String>("등록성공", HttpStatus.OK)
                : new ResponseEntity<String> ("등록실패", HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "회원정보 리스트 가져오기", response = String.class)
    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody UserInfo userInfo){
        return userServiceImpl.updateUser(userInfo) ? new ResponseEntity<String>("등록성공", HttpStatus.OK)
                : new ResponseEntity<String> ("등록실패", HttpStatus.NOT_FOUND);
    }

    @ApiOperation(value = "회원정보 리스트 가져오기", response = String.class)
    @DeleteMapping
    public ResponseEntity<String> deleteUser(@RequestBody UserInfo userInfo){
        return userServiceImpl.deleteUser(userInfo) ? new ResponseEntity<String>("등록성공", HttpStatus.OK)
                : new ResponseEntity<String> ("등록실패", HttpStatus.NOT_FOUND);
    }
}
