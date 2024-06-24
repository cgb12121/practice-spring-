package com.example.demo.api.controller;

import com.example.demo.model.Entity.Equipment;
import com.example.demo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/equipment")
    public List<Equipment> getAllEquipmentInfos() {
        return equipmentService.getAllEquipmentInfos();
    }
}
