package com.westlife.service;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.westlife.domain.User;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午9:17:31 
 * @version 1.0 
 * @parameter
 *
 */
@Repository
public interface UserService {
    void save(User user);

    List<User> findByName(String name);

}
