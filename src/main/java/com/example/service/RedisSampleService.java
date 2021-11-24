package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.example.vo.ParamVO;

@Service
public class RedisSampleService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	public void getRedisStringValue(ParamVO paramVO) {
		ValueOperations<String, String> stringValueOerations = stringRedisTemplate.opsForValue();
		String key = paramVO.getKey();

		System.out.println("Redis key : " + key);
		System.out.println("Redis value : " + stringValueOerations.get(key));
	}

	public void setRedisStringValue(ParamVO paramVO) {
		ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
		String key = paramVO.getKey();
		String value = paramVO.getValue();
		
		stringValueOperations.set(key, value);
		System.out.println("Redis key : " + key);
		System.out.println("Redis value : " + stringValueOperations.get(key));
	}

}
