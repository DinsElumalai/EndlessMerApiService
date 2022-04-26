package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.UserGroup;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long>
{

	public List<UserGroup> findByRoleGroupName(String userGroupName);
	
	@Query("SELECT DISTINCT gp.roleGroupName FROM UserGroup gp")
	public List<String> findDistinctRoleGroupName();
}
