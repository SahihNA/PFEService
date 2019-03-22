package com.PFE.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.PFE.demo.Models.Indicateur;
import com.PFE.demo.Models.Valeur;

public interface IndicateurRepo extends CrudRepository<Indicateur,Long> {
	
	@Query("SELECT  i.Nom  FROM Indicateur i")
    List indicNom();

}
