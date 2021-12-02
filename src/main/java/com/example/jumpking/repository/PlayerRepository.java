package com.example.jumpking.repository;

import com.example.jumpking.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    List<Long> findAllOrderByScore(Player player);

}
