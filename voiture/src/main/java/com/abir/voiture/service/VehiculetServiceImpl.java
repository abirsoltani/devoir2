package com.abir.voiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.abir.voiture.entities.Vehicule;
import com.abir.voiture.repos.VehiculeRepos;

@Service
public class VehiculetServiceImpl implements VehiculeService{
@Autowired
	VehiculeRepos vehiculeRepository;

	@Override
	public Vehicule saveVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public Vehicule updateVehicule(Vehicule a) {
		return vehiculeRepository.save(a);
	}

	@Override
	public void deleteVehicule(Vehicule a) {
		vehiculeRepository.delete(a);
		
	}

	@Override
	public void deleteVehiculeById(Long id) {
		vehiculeRepository.deleteById(id);
		
	}

	@Override
	public Vehicule getVehicule(Long id) {
		return vehiculeRepository.findById(id).get();
	}

	@Override
	public List<Vehicule> getAllVehicules() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Page<Vehicule> getAllVehiculesParPage(int page, int size) {
		return vehiculeRepository.findAll(PageRequest.of(page, size));
	}

}
