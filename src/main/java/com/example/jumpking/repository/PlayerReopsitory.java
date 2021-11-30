package com.example.jumpking.repository;

import com.example.jumpking.domain.Player;

import java.util.*;

public interface PlayerReopsitory {
    Player save(Player player);
    Optional<Player> findById(Long id);
    Optional<Player> findByName(String name);
    List<Player> findAll();
}
