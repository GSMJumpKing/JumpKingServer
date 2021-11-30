package com.example.jumpking.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notice {

    private Long id;
    private Admin admin;
    private String title;
    private String content;

}
