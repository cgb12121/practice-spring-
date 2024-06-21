package com.example.demo.RestController;

import com.example.demo.Entity.CharacterInfo;
import com.example.demo.Service.CharacterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character_base_stat")
public class CharacterInfoController {

    @Autowired
    private CharacterInfoService characterInfoService;

    @GetMapping("/{id}")
    public CharacterInfo getCharacterInfo(@PathVariable int id) {
        return characterInfoService.getCharacterInfoById(id);
    }

    @GetMapping
    public List<CharacterInfo> getAllCharacterInfos() {
        return characterInfoService.getAllCharacterInfos();
    }

    @PostMapping
    public CharacterInfo addCharacterInfo(@RequestBody CharacterInfo characterInfo) {
        return characterInfoService.saveCharacterInfo(characterInfo);
    }

    @PutMapping("/{id}")
    public CharacterInfo updateCharacterInfo(@RequestBody CharacterInfo newCharacter, @PathVariable int id) {
        return characterInfoService.updateCharacterInfo(newCharacter, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacterInfo(@PathVariable int id) {
        characterInfoService.deleteCharacterInfoById(id);
    }
}

