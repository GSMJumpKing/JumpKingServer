package com.example.jumpking.service;

import com.example.jumpking.domain.Player;
import com.example.jumpking.dto.AddRequestDto;
import com.example.jumpking.dto.AddResponseDto;
import com.example.jumpking.repository.AdminRepository;
import com.example.jumpking.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public AddResponseDto add(AddRequestDto request) {
        Player player = new Player();
        player.setId(0L);
        player.setName(request.getName());
        player.setScore(request.getScore());
        playerRepository.save(player);
        AddResponseDto addResponseDto = new AddResponseDto(player.getId(), player.getName(), player.getScore());
        return addResponseDto;
    }
}


