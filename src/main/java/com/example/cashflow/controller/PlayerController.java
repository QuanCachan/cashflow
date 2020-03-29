package com.example.cashflow.controller;

import com.example.cashflow.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/player")
@Controller
public class PlayerController {
    private PlayerService playerService;

    @Autowired
    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String listPlayers(Model model){
        model.addAttribute("players", playerService.getAll());
        return "player/list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getPlayer(@PathVariable long id, Model model){
        model.addAttribute("player", playerService.getById(id));
        return "player/show";
    }
}
