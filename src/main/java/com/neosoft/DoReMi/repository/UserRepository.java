package com.neosoft.DoReMi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.DoReMi.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
