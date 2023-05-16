package com.joaovictor.dslist.controllers;

import com.joaovictor.dslist.dto.GameListDTO;
import com.joaovictor.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        var result = gameListService.findAll();
        return result;
    }
}
