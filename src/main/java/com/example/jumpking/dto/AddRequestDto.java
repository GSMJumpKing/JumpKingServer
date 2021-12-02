package com.example.jumpking.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddRequestDto {
    @NotBlank(message = "name ERROR")
    String name;

    @NotBlank(message = "score ERROR")
    int score;
}
