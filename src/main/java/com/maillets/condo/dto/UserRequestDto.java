package com.maillets.condo.dto;

import com.maillets.condo.entities.UserRequest;
import com.maillets.condo.entities.UserRequestCategory;
import com.maillets.condo.entities.UserRequestStatus;

public class UserRequestDto {

	private int id;
	private String subject;
	private String unit;
	private UserRequestCategory category;
	private UserRequestStatus status;

	public static UserRequestDto fromUserRequest(UserRequest userRequest) {
		UserRequestDto dto = new UserRequestDto();
		dto.setId(userRequest.getId());
		dto.setCategory(userRequest.getCategory());
		dto.setStatus(userRequest.getStatus());
		dto.setSubject(userRequest.getSubject());
		dto.setUnit(userRequest.getUnit());
		return dto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public UserRequestCategory getCategory() {
		return category;
	}

	public void setCategory(UserRequestCategory category) {
		this.category = category;
	}

	public UserRequestStatus getStatus() {
		return status;
	}

	public void setStatus(UserRequestStatus status) {
		this.status = status;
	}
}
