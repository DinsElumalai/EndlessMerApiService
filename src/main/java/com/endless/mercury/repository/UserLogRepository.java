package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.UserLog;

@Repository
public interface UserLogRepository extends JpaRepository<UserLog, Long>
{

	List<UserLog> findByUserId(String userId);
}
