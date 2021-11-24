package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@EnableCaching
@SpringBootApplication
public class RedisEduProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisEduProjectApplication.class, args);
	}

}
