package com.example.jumpking.controller;

import com.example.jumpking.domain.Player;
import com.example.jumpking.dto.AddRequestDto;
import com.example.jumpking.dto.AddResponseDto;
import com.example.jumpking.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @PostMapping("/add-player")
    public ResponseEntity addPlayer(AddRequestDto request) {
        AddResponseDto result = playerService.add(request);
        return ResponseEntity.ok(result);
    }

}
