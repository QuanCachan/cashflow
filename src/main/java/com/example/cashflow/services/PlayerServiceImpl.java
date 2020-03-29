package com.example.cashflow.services;

import com.example.cashflow.domain.Player;
import com.example.cashflow.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAll() {
        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

    @Override
    public Optional<Player> getById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Player createOrUpdatePlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
