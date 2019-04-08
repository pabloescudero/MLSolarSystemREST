package com.SolarSystem.RestApi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SolarSystem.RestApi.model.Clima;
import com.SolarSystem.RestApi.repository.ClimaRepository;

@Service
public class ClimaDAO {
	@Autowired
	private ClimaRepository climaRepository;
	
	/*Buscar el clima de un dia en particular*/
	public Clima getClima(Integer id) {
		return climaRepository.getOne(id);
	}
}
