package com.PFE.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PFE.demo.Models.Commune;
import com.PFE.demo.Repositories.CommuneRepo;
import com.PFE.demo.Repositories.IndicateurRepo;
import com.PFE.demo.Repositories.ValeurRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Indicateur")
public class IndicateurController {
	
	@Autowired
	
    IndicateurRepo indicRepo;
	@Autowired
	ValeurRepo vr;
	@Autowired
    CommuneRepo commrepo;
	
    
    @GetMapping("/NomIndicateur")
    public List nomIndicateur(){
    	return indicRepo.indicNom();
    }
    
    @GetMapping("/NomCommunes ")
	public Iterable<Commune> provi(){
    	return commrepo.findAll();
    }
    @GetMapping("/{nomIndicateur}")
	public List prov(@PathVariable String nomIndicateur){
    	return indicRepo.indic(nomIndicateur);
    }

}
