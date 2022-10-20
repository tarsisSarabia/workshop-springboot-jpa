package com.tarsissarabia.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarsissarabia.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Tarsis", "tarsisfabiano@gmail", "99999999", "qwerty");
		return ResponseEntity.ok().body(u);
		
	}
}
