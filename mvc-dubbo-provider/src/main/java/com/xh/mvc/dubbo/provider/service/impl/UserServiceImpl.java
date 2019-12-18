package com.xh.mvc.dubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import com.xh.mvc.dubbo.service.UserService;

/**
 * <b>Title: 服务提供者</b>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2019年7月30日
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String show() {

		return "Hello Dubbo，我是服务提供者，欢迎使用User服务。";
	}

	@Override
	public String show(String name) {

		return "我是服务提供者，欢迎使为 " + name + "服务！";
	}

}
