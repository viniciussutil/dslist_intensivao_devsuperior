package com.viniciussutil.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussutil.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}