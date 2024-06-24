package com.example.demo.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "character_base_stat", schema = "game")
public class CharacterInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "hero",nullable = false)
    private String hero;

    @Column(name = "hp", nullable = false)
    private int hp;

    @Column(name = "mp", nullable = false)
    private int mp;

    @Column(name = "atk", nullable = false)
    private int atk;

    @Column(name = "def", nullable = false)
    private int def;

    @Column(name = "spd", nullable = false)
    private int spd;

    @Override
    public String toString() {
        return String.format("%-5s%-30s%-20s%-5s%-5s%-5s%-5s%-5s",
                id, name, hero, hp, mp, atk, def, spd);
    }
}