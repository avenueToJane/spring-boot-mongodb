package com.westlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.westlife.common.RequestDto;
import com.westlife.domain.User;
import com.westlife.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午9:16:38 
 * @version 1.0 
 * @parameter
 *
 */
@Api(value = "测试Mongodb",description="简单的API")
@RestController
@EnableScheduling//定时任务的注解
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;
    
    @ApiOperation(value = "添加用户") 
	@RequestMapping(value="/save", method = RequestMethod.POST)
    public User save(@RequestBody(required = true) User user) {
        mongoTemplate.save(user);
        return user;
    }

    @ApiOperation(value = "查询所有用户") 
	@RequestMapping(value="/find", method = RequestMethod.POST)
    public List<User> find() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return userList;
    }

    @ApiOperation(value = "按名称查询用户查询用户") 
   	@RequestMapping(value="/findByName", method = RequestMethod.POST)
    public List<User> findByName(@RequestBody(required = true) RequestDto requestDto) {
    	List<User> userList = userService.findByName(requestDto.getName());
        return userList;
    }
 // 每5分钟执行一次
 		@Scheduled(cron = "0 05 * * * ? ")
 		public void timer() {
 			mongoTemplate.dropCollection(User.class);;//删除集合，可传实体类，也可以传名称
 		}
}
