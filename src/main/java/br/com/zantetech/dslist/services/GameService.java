package br.com.zantetech.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.zantetech.dslist.dto.GameMinDTO;
import br.com.zantetech.dslist.entities.Game;
import br.com.zantetech.dslist.repositories.GameRepository;

@Component //poderia ser "Service" daria mesmo resultado
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
