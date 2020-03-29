package com.example.cashflow.controller;

import com.example.cashflow.model.Game;
import com.example.cashflow.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@RequestMapping("/game")
@Controller
public class GameController {
    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String listPlayers(Model model){
        model.addAttribute("games", gameService.getAll());
        return "game/list";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createNewGame(@RequestBody @Valid Game game, Model model){
        model.addAttribute("game", gameService.createOrUpdateGame(game));
        return "game/create-game";
    }
}
