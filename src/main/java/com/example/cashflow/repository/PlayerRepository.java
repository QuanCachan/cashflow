package com.example.cashflow.repository;

import com.example.cashflow.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Page<Player> findByGameId (Long gameId, Pageable pageable);
    Optional<Player> findByIdAndGameId(Long gameId, Long id);
}
