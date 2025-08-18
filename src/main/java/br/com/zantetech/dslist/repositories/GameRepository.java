package br.com.zantetech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zantetech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	

}
