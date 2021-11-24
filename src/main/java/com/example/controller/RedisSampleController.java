package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.RedisSampleService;
import com.example.vo.ParamVO;

@RestController
public class RedisSampleController {

	@Autowired
	private RedisSampleService redisSampleService;
	
	@GetMapping(value = "/getSessionId")
	public String getSessionId(HttpSession session) {
		return session.getId();
	}
	
	@PostMapping(value = "/getRedisStringValue")
	public void getRedisStringValue(@RequestBody ParamVO paramVO) {
		redisSampleService.getRedisStringValue(paramVO);
	}
	
	@PostMapping(value = "/setRedisStringValue")
	public void setRedisStringValue(@RequestBody ParamVO paramVO) {
		redisSampleService.setRedisStringValue(paramVO);
	}
	
}
