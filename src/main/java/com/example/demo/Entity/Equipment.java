package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equipment", schema = "game")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "hp", nullable = false)
    private Integer hp;

    @Column(name = "mp", nullable = false)
    private Integer mp;

    @Column(name = "atk", nullable = false)
    private Integer atk;

    @Column(name = "def", nullable = false)
    private Integer def;

    @Column(name = "spd", nullable = false)
    private Integer spd;

    @Override
    public String toString() {
        return String.format("%-5s%-30s%-50s%-10s%-5s%-5s%-5s%-5s%-5s",
                id, name, description, price, hp, mp, atk, def, spd);
    }
}