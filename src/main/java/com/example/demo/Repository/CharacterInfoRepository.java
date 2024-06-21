package com.example.demo.Repository;

import com.example.demo.Entity.CharacterInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CharacterInfoRepository extends JpaRepository<CharacterInfo, Integer> {
    List<CharacterInfo> findAll();
    List<CharacterInfo> findCharacterInfoByHero(String hero);
    List<CharacterInfo> findCharacterInfoByAtk(int atk);
}
