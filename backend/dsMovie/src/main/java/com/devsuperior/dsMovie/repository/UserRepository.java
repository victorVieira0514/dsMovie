package com.devsuperior.dsMovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsMovie.entities.Movie;
import com.devsuperior.dsMovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
