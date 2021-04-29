package com.moriaty.springdemo2.service;

import com.moriaty.springdemo2.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> getUser(int age);
}
