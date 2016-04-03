package com.maillets.condo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maillets.condo.dto.UserRequestDto;
import com.maillets.condo.entities.UserRequest;
import com.maillets.condo.repository.UserRequestRepository;

@RestController
@RequestMapping("/api/requests")
public class UserRequestController {

	private static final Logger logger = LoggerFactory.getLogger(UserRequestController.class);

	@Autowired
	UserRequestRepository userRequestRepository;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public List<UserRequestDto> getRequests() {
		logger.info("getRequests");

		List<UserRequest> requests = userRequestRepository.findAll();

		List<UserRequestDto> dtos = new ArrayList<>();
		requests.forEach(t -> {
			dtos.add(UserRequestDto.fromUserRequest(t));
		});

		return dtos;
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	public UserRequestDto getRequestById(Integer id) {
		logger.info("getRequestById");

		UserRequest request = userRequestRepository.findOne(id);
		return UserRequestDto.fromUserRequest(request);
	}
}
