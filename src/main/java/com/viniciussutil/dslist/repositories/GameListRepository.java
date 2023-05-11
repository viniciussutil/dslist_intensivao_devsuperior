package com.viniciussutil.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussutil.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}