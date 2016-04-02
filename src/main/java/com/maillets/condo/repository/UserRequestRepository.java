package com.maillets.condo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maillets.condo.entities.UserRequest;

public interface UserRequestRepository extends JpaRepository<UserRequest, Integer> {

}
