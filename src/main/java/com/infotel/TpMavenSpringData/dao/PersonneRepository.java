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
public interface PersonneRepository  extends JpaRepository <Personne,Integer>{
 public List<Personne> findByprenom(String x);
 
// 2 eme methode de requette
 @Query("select p from Personne p where p.nom like :x")//passer un parametre sappelle x qui doit etre nom// x cc'est le nom
 public List<Personne> rechercherParMC(@Param("x")String nom);//il connait pas la nommenclature de rechercherParMc donc on fai requett nomm dans interface
 // on importe le 2 eme import de param

  @Modifying
	@Query("update Personne SET nom = :x where id = :y")
	public int modifierNomPersonne(@Param("x") String nom, @Param("y") int id);
  
  @Modifying
 	@Query("update Personne SET adresse.idAdresse = :x where id = :y")
 	public int ajouterAdressePersonne(@Param("y") int id,@Param("x") int idAdresse);
 
}
