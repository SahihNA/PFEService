package com.PFE.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.PFE.demo.Models.Valeur;


public interface ValeurRepo extends CrudRepository<Valeur,Long> {
	
	@Query("SELECT  i  FROM Valeur i")
    List findprov();
	
	
	@Query("SELECT i.valeur FROM Valeur i where i.indicateur.Nom=?1 ")
    List findAllValues(String indicateur);
	
	@Query("select i from Valeur i where i.indicateur.Nom=?1")
    List findByIndicateur(String indicateur);
	
	@Query("select i from Valeur i where i.indicateur.Nom=?1 and i.commune.code_province=?2")
    List findByIndicateurCodeprov(String indicateur,String codeprov);
	
	@Query("select i.valeur from Valeur i where i.indicateur.Nom=?1 and i.commune.code_province=?2")
    List findOnlyValuesByIndicateurCodeprov(String indicateur,String codeprov);
	
	/*@Query("SELECT i FROM Valeur i WHERE i.annee=?1")
    List findByAnnee(int annee);*/

}
