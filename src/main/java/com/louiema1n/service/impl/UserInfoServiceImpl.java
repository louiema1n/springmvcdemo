package com.louiema1n.service.impl;

import com.louiema1n.domain.UserInfo;
import com.louiema1n.mapper.UserInfoMapper;
import com.louiema1n.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoById(Long id) {
        return this.userInfoMapper.queryUserInfoById(id);
    }
}
