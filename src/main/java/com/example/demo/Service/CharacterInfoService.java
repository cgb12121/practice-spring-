package com.example.demo.Service;

import com.example.demo.Entity.CharacterInfo;
import com.example.demo.Repository.CharacterInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CharacterInfoService {

    @Autowired
    private CharacterInfoRepository characterInfoRepository;

    @Transactional
    public CharacterInfo getCharacterInfoById(int id) {
        return characterInfoRepository.findById(id).orElse(null);
    }

    @Transactional
    public List<CharacterInfo> getAllCharacterInfos() {
        return characterInfoRepository.findAll();
    }

    @Transactional
    public CharacterInfo saveCharacterInfo(CharacterInfo characterInfo) {
        return characterInfoRepository.save(characterInfo);
    }

    @Transactional
    public CharacterInfo updateCharacterInfo(CharacterInfo newCharacter, int id) {
        return characterInfoRepository.findById(id)
                .map(existingCharacter -> {
                    existingCharacter.setName(newCharacter.getName());
                    existingCharacter.setHero(newCharacter.getHero());
                    existingCharacter.setHp(newCharacter.getHp());
                    existingCharacter.setMp(newCharacter.getMp());
                    existingCharacter.setAtk(newCharacter.getAtk());
                    existingCharacter.setDef(newCharacter.getDef());
                    existingCharacter.setSpd(newCharacter.getSpd());
                    return characterInfoRepository.save(existingCharacter);
                })
                .orElseGet(() -> {
                    newCharacter.setId(id);
                    return characterInfoRepository.save(newCharacter);
                });
    }

    @Transactional
    public void deleteCharacterInfoById(int id) {
        characterInfoRepository.deleteById(id);
    }
}
