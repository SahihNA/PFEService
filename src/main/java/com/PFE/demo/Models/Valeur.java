package com.PFE.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Valeur")
public class Valeur {
	
	@Id
    @GeneratedValue
    @Column(columnDefinition = "SERIAL")
    private Long id;
    private double valeur;
    @ManyToOne
    private Indicateur indicateur;
    @ManyToOne
    private Commune commune;
    private int annee;
 
    
    

	public Valeur() {
		
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public double getValeur() {
		return valeur;
	}




	public void setValeur(double valeur) {
		this.valeur = valeur;
	}




	public String getIndicateur() {
		return indicateur.getNom();
	}




	public void setIndicateur(Indicateur indicateur) {
		this.indicateur = indicateur;
	}




	public Commune getCommune() {
		return commune;
	}




	public void setCommune(Commune commune) {
		this.commune = commune;
	}




	public int getAnnee() {
		return annee;
	}




	public void setAnnee(int annee) {
		this.annee = annee;
	}





	
	
	

}
