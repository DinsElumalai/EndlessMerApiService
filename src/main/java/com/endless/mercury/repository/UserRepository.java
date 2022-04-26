package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

	public User findByUserId(String userId);
}
