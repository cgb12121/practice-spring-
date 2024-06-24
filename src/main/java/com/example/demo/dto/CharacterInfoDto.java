package com.example.demo.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.demo.model.Entity.CharacterInfo}
 */
@Value
public class CharacterInfoDto implements Serializable {
    int id;
    String name;
    String hero;
    int hp;
    int mp;
    int atk;
    int def;
    int spd;
}