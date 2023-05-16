package com.joaovictor.dslist.services;

import com.joaovictor.dslist.dto.GameDTO;
import com.joaovictor.dslist.dto.GameMinDTO;
import com.joaovictor.dslist.entities.Game;
import com.joaovictor.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return  new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        var dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
