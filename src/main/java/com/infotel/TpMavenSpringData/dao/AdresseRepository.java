package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

@Transactional
public interface AdresseRepository  extends JpaRepository <Adresse,Integer>{
	 public List<Adresse> findByNomRue(String x);
	 
	 @Modifying
		@Query("update Adresse SET nomRue = :x where idAdresse = :y")
		public int modifierNomRueAdresse(@Param("x") String nomRue, @Param("y") int idAdresse);
}
