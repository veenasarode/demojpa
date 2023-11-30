package com.jpaexample;

import com.jpaexample.entity.User;
import com.jpaexample.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemojpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemojpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		User user = new User();
		user.setName("Rahul Shinde");
		user.setCity("Gujrat");
		user.setStatus("I am Java Programmer");

		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
