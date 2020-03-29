package com.example.cashflow.service;

import com.example.cashflow.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    List<Player>getAll();

    Optional<Player> getById(Long id);

    Player createOrUpdatePlayer(Player player);

    void deletePlayer(Long id);
}
