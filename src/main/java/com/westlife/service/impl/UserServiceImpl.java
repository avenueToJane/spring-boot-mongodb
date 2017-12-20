package com.westlife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westlife.dao.UserRepository;
import com.westlife.domain.User;
import com.westlife.service.UserService;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午9:17:38 
 * @version 1.0 
 * @parameter
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> findByName(String name) {
        return this.userRepository.findByName(name);
    }
}
