package com.joaovictor.dslist.services;

import com.joaovictor.dslist.dto.GameListDTO;
import com.joaovictor.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        var dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}
