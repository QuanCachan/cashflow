package com.example.cashflow.service;

import com.example.cashflow.model.Game;
import com.example.cashflow.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getAll() {
        List<Game> games = new ArrayList<>();
        gameRepository.findAll().forEach(games::add);
        return games;
    }

    @Override
    public Optional<Game> getById(Long id) {
        return gameRepository.findById(id);
    }

    @Override
    public Game createOrUpdateGame(Game game) {
        gameRepository.save(game);
        return game;
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}
