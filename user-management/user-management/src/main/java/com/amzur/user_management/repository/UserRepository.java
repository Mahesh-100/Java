package com.amzur.user_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amzur.user_management.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByEmail(String email);

}
