package com.example.demo.service;

import com.example.demo.model.Entity.Equipment;
import com.example.demo.Repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> getAllEquipmentInfos() {
        return equipmentRepository.findAll();
    }
}

