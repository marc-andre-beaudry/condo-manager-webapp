package com.maillets.condo;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maillets.condo.entities.UserRequest;
import com.maillets.condo.entities.UserRequestCategory;
import com.maillets.condo.entities.UserRequestStatus;
import com.maillets.condo.repository.UserRequestRepository;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AppConfig {

	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);

	@Autowired
	private UserRequestRepository userRequestRepository;

	@Bean
	CommandLineRunner init() {

		return arg -> {

			Random random = new Random();

			UserRequestCategory[] categories = UserRequestCategory.values();
			UserRequestStatus[] status = UserRequestStatus.values();

			for (int i = 0; i < 100; i++) {

				UserRequest request = new UserRequest();
				request.setSubject("Sauce Nuage Sauce Nuage");
				request.setUnit("U" + random.nextInt(100));
				request.setCategory(categories[random.nextInt(categories.length)]);
				request.setStatus(status[random.nextInt(status.length)]);
				userRequestRepository.save(request);
			}
			userRequestRepository.flush();

			logger.info("Init done!");
		};
	}
}