package com.westlife.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午9:17:21 
 * @version 1.0 
 * @parameter
 *
 */
@ApiModel(value = "用户信息", description = "用户信息")
public class User implements Serializable{
	private static final long serialVersionUID = 1492973623389075081L;
	
    @NotEmpty(message="id不能为空!!!")
    private String id;
    @NotEmpty(message="name不能为空!!!")
    private String name;
    @NotEmpty(message="age不能为空!!!")
    private String age;

    @ApiModelProperty("唯一标识")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @ApiModelProperty("姓名")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ApiModelProperty("年龄")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	} 
}
