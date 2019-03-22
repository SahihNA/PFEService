package com.PFE.demo.Models;


import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "CentroidCommune")
public class Commune {

	@Id
    private Long id;
    private String NomC;
    
    private double x;
    private double y;
	
	public Commune() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomC() {
		return NomC;
	}

	public void setNomC(String nomC) {
		NomC = nomC;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Commune(String nomC, double x, double y) {
		super();
		NomC = nomC;
		this.x = x;
		this.y = y;
	}
	
	

}
