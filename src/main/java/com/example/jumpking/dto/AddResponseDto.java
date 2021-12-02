package com.example.jumpking.dto;

import com.example.jumpking.domain.Player;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddResponseDto {
    private Long id;
    private String name;
    private int score;

    public AddResponseDto(Player player) {
        this.id = player.getId();
        this.name = player.getName();
        this.score = player.getScore();
    }
}
