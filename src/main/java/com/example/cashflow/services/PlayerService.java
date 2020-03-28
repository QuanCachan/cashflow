package com.example.cashflow.services;

import com.example.cashflow.domain.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    List<Player>getAll();

    Optional<Player> getById(Long id);

    Player createOrUpdatePlayer(Player player);

    void deletePlayer(Long id);
}
