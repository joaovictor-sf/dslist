package com.joaovictor.dslist.controllers;

import com.joaovictor.dslist.dto.GameMinDTO;
import com.joaovictor.dslist.entities.Game;
import com.joaovictor.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControllers {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }
}