package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.UserAccessedPage;

@Repository
public interface UserAccessedPageRepository extends JpaRepository<UserAccessedPage, Long>
{

}
