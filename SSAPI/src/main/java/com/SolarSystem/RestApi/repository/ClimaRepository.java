package com.SolarSystem.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SolarSystem.RestApi.model.Clima;;

@Repository
@Transactional
public interface ClimaRepository extends JpaRepository<Clima,Integer>{

}
