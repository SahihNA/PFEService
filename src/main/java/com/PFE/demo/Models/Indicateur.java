package com.PFE.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Indicateur")

public class Indicateur {
	
	@Id
    @GeneratedValue
    @Column(columnDefinition = "SERIAL")
    private Long id;
    private String Nom;
    private String Description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Indicateur(String nom, String description) {
		super();
		Nom = nom;
		Description = description;
	}
	public Indicateur() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
    
    
    

}
