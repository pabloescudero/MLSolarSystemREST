package com.SolarSystem.RestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SolarSystem.RestApi.dao.ClimaDAO;
import com.SolarSystem.RestApi.model.Clima;

@RestController
@RequestMapping("/clima")
public class ClimaController {
	
	@Autowired
	ClimaDAO climaDAO;

	@GetMapping("/{dia}")
	public ResponseEntity<Clima> getClima(@PathVariable(value="dia") Integer dia){
		//En realidad aca devuelve un proxy que no tiene implementado el serializable
		Clima clima = climaDAO.getClima(dia);
		
		if(clima==null) {
			return ResponseEntity.notFound().build();
		}
		Clima responseClima = new Clima();
		responseClima.setFecha(clima.getFecha());
		responseClima.setClima(clima.getClima());
		responseClima.setDia(clima.getDia());
		return ResponseEntity.ok().body(responseClima);
	}
		
}
