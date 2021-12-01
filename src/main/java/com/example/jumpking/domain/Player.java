package com.example.jumpking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Player {

    private Long id;
    private String name;
    private String score;

}
