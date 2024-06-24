package com.example.demo.Repository;

import com.example.demo.model.Entity.CharacterInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacterInfoRepository extends JpaRepository<CharacterInfo, Integer> {
}
