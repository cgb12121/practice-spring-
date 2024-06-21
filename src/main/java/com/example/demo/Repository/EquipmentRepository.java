package com.example.demo.Repository;

import com.example.demo.Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    List<Equipment> findByName(String name);
    List<Equipment> findByPriceBetween(double price, double price2);
    List<Equipment> findByHpGreaterThanEqual(Integer hp);
    List<Equipment> findByAtkGreaterThanEqual(Integer atk);
    List<Equipment> findByDefGreaterThanEqual(Integer def);
    List<Equipment> findBySpdGreaterThanEqual(Integer spd);
    List<Equipment> findByDescriptionContaining(String keyword);

}