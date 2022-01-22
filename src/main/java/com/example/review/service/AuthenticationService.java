package com.example.review.service;

import com.example.review.mapper.UserMapper;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements AuthenticationProvider {
    private UserMapper userMapper;

}
