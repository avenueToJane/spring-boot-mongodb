/**
 * 
 */
package com.westlife.common;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:38 
 * @version 1.0 
 * @parameter
 *
 */
@ApiModel(value = "请求参数", description = "请求参数")
public class RequestDto {
	@NotEmpty(message="name不能为空!!!")
	private String name;
	
	@ApiModelProperty("名称")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
