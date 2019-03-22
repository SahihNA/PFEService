package com.PFE.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PFE.demo.Models.Valeur;
import com.PFE.demo.Repositories.IndicateurRepo;
import com.PFE.demo.Repositories.ValeurRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Valeur")
public class ValeurController {

	
@Autowired
	ValeurRepo valeurRepo;
 
	
    
   	@GetMapping("/all")
    public Iterable<Valeur> all(){
        return valeurRepo.findAll();
    }
	
	@GetMapping("/tes")
	public List prov(){
    	return valeurRepo.findprov();
    }
	
	@GetMapping("/t/{annee}")
	public List pro(@PathVariable int annee){
    	return valeurRepo.findByAnnee(annee);
    }
	@GetMapping("/{nomIndicateur}")
	public List pr(@PathVariable String nomIndicateur){
    	return valeurRepo.findByIndicateur(nomIndicateur);
    }
	
	@GetMapping("/{nomIndicateur}/{annee}")
	public List p(@PathVariable String nomIndicateur,@PathVariable int annee){
    	return valeurRepo.findByIndicateurAnnee(nomIndicateur, annee);
    }
	
	
	
	
	
	
	
	

}
