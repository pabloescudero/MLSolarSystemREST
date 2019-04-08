package com.SolarSystem.RestApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="clima")
@EntityListeners(AuditingEntityListener.class)
public class Clima {
	
	@Id
	@Column(name="iddia")
	private Integer dia;
	
	@Column(name="pronostico")
	private String clima;
	
	@Column(name="fecha")
	private Date fecha;
	
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer iddia) {
		this.dia = iddia;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String pronostico) {
		this.clima = pronostico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Clima() {
		
	}

}
