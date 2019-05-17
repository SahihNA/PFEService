package com.PFE.demo.Models;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CommuneCentroid")
public class Commune {

	@Id
    private Long id;
    private String NomC; 
    private double latitude;
    private double longitude;
    
    private long code_reg;
    private String code_commune;
   
    private String  code_province;
    
    
    
	public String getCode_commune() {
		return code_commune;
	}
	public void setCode_commune(String code_commune) {
		this.code_commune = code_commune;
	}
	public String getNomC() {
		return NomC;
	}
	public void setNomC(String nomC) {
		NomC = nomC;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	
	public String getCode_province() {
		return code_province;
	}
	public void setCode_province(String code_province) {
		this.code_province = code_province;
	}
	public Long getId() {
		return id;
	}
	
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCode_reg() {
		return code_reg;
	}
	public void setCode_reg(long code_reg) {
		this.code_reg = code_reg;
	}
	public Commune(String nomC, double latitude, double longitude, long code_reg, String code_commune,
			String code_province) {
		super();
		NomC = nomC;
		this.latitude = latitude;
		this.longitude = longitude;
		this.code_reg = code_reg;
		this.code_commune = code_commune;
		this.code_province = code_province;
	}
	
	
	
    
	
	
	
	

}
