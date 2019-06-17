package com.fhh.controller;

import com.fhh.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-01-14 15:21
 */
@RestController
public class UserController {

	@GetMapping("getUser")
	public User getUser(@Valid User user){
		return user;
	}
}