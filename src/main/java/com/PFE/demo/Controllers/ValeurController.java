package com.PFE.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PFE.demo.Models.Commune;
import com.PFE.demo.Models.Valeur;

import com.PFE.demo.Repositories.CommuneRepo;
import com.PFE.demo.Repositories.IndicateurRepo;
import com.PFE.demo.Repositories.ProvinceRepo;
import com.PFE.demo.Repositories.RegionRepo;
import com.PFE.demo.Repositories.ValeurRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Valeur")
public class ValeurController {

	
@Autowired
	ValeurRepo valeurRepo;
@Autowired
    CommuneRepo commrepo;

@Autowired
RegionRepo regrepo;

@Autowired
ProvinceRepo provrepo;



@GetMapping("/NomIndicateur")
public Iterable<Commune> pr(){
	return commrepo.findAll();
}
	
    
   	@GetMapping("/all")
    public Iterable<Valeur> all(){
        return valeurRepo.findAll();
    }
   	
   	
   	
   	@GetMapping("/NomCommunes")
   	public List p(){
    	return commrepo.hey();
    }
   	
   	@GetMapping("/Regions")
   	public List regions(){
    	return regrepo.region();
    }
   	
   	@GetMapping("/Provinces")
   	public List provinces(){
    	return provrepo.provinces();
    }
   	
   	@GetMapping("/NomProvinces")
   	public List nomprovinces(){
    	return provrepo.nomprovince();
    }
   	
   	@GetMapping("/Communes")
   	public List communes(){
    	return commrepo.he();
    }
   	
   	@GetMapping("/Communes/{codeprov}")
	public List communesbycodeprov(@PathVariable String codeprov){
    	return commrepo.findByCodeprov(codeprov);
    }
   	
   	@GetMapping("/Provinces/{codereg}")
	public List provincessbycodereg(@PathVariable long codereg){
    	return provrepo.findByCodeRegion(codereg);
    }
	@GetMapping("/tes")
	public List prov(){
    	return valeurRepo.findprov();
    }
	
	@GetMapping("/AllValues/{nomIndicateur}")
	public List allValues(@PathVariable String nomIndicateur){
    	return valeurRepo.findAllValues(nomIndicateur);
    }
	
	
	@GetMapping("/{nomIndicateur}")
	public List pr(@PathVariable String nomIndicateur){
    	return valeurRepo.findByIndicateur(nomIndicateur);
    }
	
	@GetMapping("/{nomIndicateur}/{codeprov}")
	public List p(@PathVariable String nomIndicateur,@PathVariable String codeprov){
    	return valeurRepo.findByIndicateurCodeprov(nomIndicateur, codeprov);}
	
	@GetMapping("/OnlyValues/{nomIndicateur}/{codeprov}")
	public List onlyvaluesbyindicprov(@PathVariable String nomIndicateur,@PathVariable String codeprov){
    	return valeurRepo.findOnlyValuesByIndicateurCodeprov(nomIndicateur, codeprov);}
    
    	
    /*	@GetMapping("/t/{annee}")
	public List pro(@PathVariable int annee){
    	return valeurRepo.findByAnnee(annee);
    }
    }*/
	
	
	
	
	
	
	
	

}
