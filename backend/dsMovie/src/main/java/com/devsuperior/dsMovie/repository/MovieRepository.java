package com.devsuperior.dsMovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsMovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
