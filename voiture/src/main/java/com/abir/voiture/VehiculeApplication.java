package com.abir.voiture;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.abir.voiture.entities.Vehicule;
import com.abir.voiture.service.VehiculeService;

@SpringBootApplication
public class VehiculeApplication implements CommandLineRunner {
	@Autowired
VehiculeService articleService;
	public static void main(String[] args) {
		SpringApplication.run(VehiculeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		articleService.saveVehicule(new Vehicule("Kia","noir",1500.000,new Date()));
		articleService.saveVehicule(new Vehicule("Fiat","maron",180.0000,new Date()));
		articleService.saveVehicule(new Vehicule("cheverlet","noir",1500.300,new Date()));
		articleService.saveVehicule(new Vehicule("Golf7","rouge",150.200,new Date()));
		articleService.saveVehicule(new Vehicule("BMW","rouge",200.000,new Date()));
		
	}

}

