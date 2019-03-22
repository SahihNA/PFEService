package com.PFE.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PFE.demo.Repositories.IndicateurRepo;
import com.PFE.demo.Repositories.ValeurRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Indicateur")
public class IndicateurController {
	
	@Autowired
	
    IndicateurRepo indicRepo;
	
    
    @GetMapping("/NomIndicateur")
    public List p(){
    	return indicRepo.indicNom();
    }

}
