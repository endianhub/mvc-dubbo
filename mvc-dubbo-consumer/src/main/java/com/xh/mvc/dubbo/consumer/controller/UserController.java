package com.xh.mvc.dubbo.consumer.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xh.mvc.dubbo.service.UserService;

/**
 * <b>Title: 服务消费者</b>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2019年7月31日
 */
@Controller
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("info")
	public String info() {
		return "info";
	}

	@RequestMapping("show")
	@ResponseBody
	public String show() {
		String msg = userService.show();
		return msg;
	}

	@RequestMapping("show/name")
	@ResponseBody
	public String show(String name) {
		String msg = userService.show(name);
		return msg;
	}

}
