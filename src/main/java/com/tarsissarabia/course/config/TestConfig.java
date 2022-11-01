package com.tarsissarabia.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tarsissarabia.course.entities.User;
import com.tarsissarabia.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(1, "Aline Sarabia", "aline@gmail.com","999999999" ,"123456");
		User u2 = new User(2, "Tarsis Sarabia", "tarsis@gmail.com", "991051935", "789456");
		
		userRepository.saveAllAndFlush(Arrays.asList(u1, u2 ));
		
	}
	
	

}
