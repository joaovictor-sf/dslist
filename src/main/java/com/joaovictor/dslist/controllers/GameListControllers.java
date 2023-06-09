package com.joaovictor.dslist.controllers;

import com.joaovictor.dslist.dto.GameListDTO;
import com.joaovictor.dslist.dto.GameMinDTO;
import com.joaovictor.dslist.dto.ReplacemantDTO;
import com.joaovictor.dslist.services.GameListService;
import com.joaovictor.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        var result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGameList(listId);
        return result;
    }

    @GetMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacemantDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
