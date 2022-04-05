package com.eheio.gi4.pfa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eheio.gi4.pfa.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	

}
