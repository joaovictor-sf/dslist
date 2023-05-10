package com.joaovictor.dslist.services;

import com.joaovictor.dslist.dto.GameMinDTO;
import com.joaovictor.dslist.entities.Game;
import com.joaovictor.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        var dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
