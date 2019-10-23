package com.louiema1n.controller;

import com.louiema1n.domain.UserInfo;
import com.louiema1n.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public UserInfo getUserInfo() {
        return this.userInfoService.getUserInfoById(1L);
    }
}
