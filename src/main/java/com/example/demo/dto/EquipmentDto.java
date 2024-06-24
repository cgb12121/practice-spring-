package com.example.demo.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.demo.model.Entity.Equipment}
 */
@Value
public class EquipmentDto implements Serializable {
    Integer id;
    String name;
    String type;
    String description;
    double price;
    Integer hp;
    Integer mp;
    Integer atk;
    Integer def;
    Integer spd;
}