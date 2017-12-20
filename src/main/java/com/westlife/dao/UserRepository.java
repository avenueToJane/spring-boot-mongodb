package com.westlife.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.westlife.domain.User;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午9:17:07 
 * @version 1.0 
 * @parameter
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
    
    List<User> findByName(String name);
}
