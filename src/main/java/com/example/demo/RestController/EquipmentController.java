package com.example.demo.RestController;

import com.example.demo.Entity.Equipment;
import com.example.demo.Service.EquipmentService;
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
