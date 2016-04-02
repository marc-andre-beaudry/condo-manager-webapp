package com.maillets.condo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_request")
public class UserRequest {

	@Id
	@GeneratedValue
	private int id;

	private String subject;
	private String unit;
	private UserRequestCategory category;
	private UserRequestStatus status;

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
