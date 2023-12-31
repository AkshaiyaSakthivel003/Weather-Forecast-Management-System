package com.example.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.weather.model.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	@Query("select count(d) from Login d where d.username = ?1")
	public List<Integer> usernameExists(String username);
	
	@Query("select password from Login d where d.username = ?1")
	public String passwordExists(String username);

}