package com.example.demo;

import com.example.demo.Repository.CharacterInfoRepository;
import com.example.demo.Repository.EquipmentRepository;
import com.example.demo.api.controller.CharacterInfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private EquipmentRepository equipmentRepository;

	@Autowired
	private CharacterInfoRepository characterInfoRepository;

	@Autowired
	private CharacterInfoController characterInfoController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		equipmentRepository.findById(1);
		equipmentRepository.findAll().forEach(System.out::println);

		characterInfoRepository.findAll().forEach(System.out::println);

		System.out.println(characterInfoController.getAllCharacterInfos());
	}
}
