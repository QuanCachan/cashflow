package com.example.cashflow.repositories;

import com.example.cashflow.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
