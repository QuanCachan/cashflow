package com.example.cashflow.service;


import com.example.cashflow.model.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {

    List<Game> getAll();

    Optional<Game> getById(Long id);

    Game createOrUpdateGame(Game game);

    void deleteGame(Long id);
}
