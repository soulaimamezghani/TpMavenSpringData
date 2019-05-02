package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;



public interface Iservice {
	 public Personne ajouterPersonne(Personne p);
	 public Personne getPersonne (int idPersonne);
	 public Optional<Personne> affichagePersonne(int idPersonne);
	public void supprimerPersonne (Personne p);
	public int modifierNomPersonne( String nom,int id);
	public Iterable<Personne> findAllPersonnes();
	public List<Personne> chercherParPrenom(String prenom);
	public List<Personne> rechercherParMC(String nom);
 	public int ajouterAdressePersonne(int idPersonne,int idAdresse);
	
	public Adresse ajouterAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public Optional<Adresse> affichageAdresse(int idAdresse);
	public void supprimerAdresse(Adresse a);
	public int modifierNomRueAdresse( String nomRue,int idAdresse);
	public List<Adresse> findAllAdresses();
	public List<Adresse> chercherParNomRue(String NomRue);



}
