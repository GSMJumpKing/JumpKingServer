package com.example.jumpking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Notice {

    private Long id;
    private Admin admin;
    private String title;
    private String content;

}
