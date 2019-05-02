package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
@Service
public class ServiceImpl implements Iservice {
	@Autowired
	private PersonneRepository personneRepository;//persR de type PerR //PerR remplace private	
	
	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {
		
		return personneRepository.save(p);	
	}
	@Override
	public Personne getPersonne(int idPersonne) {
		
		return personneRepository.getOne(idPersonne);
	}
    @Override
	public Optional<Personne> affichagePersonne(int idPersonne) {
		
		return personneRepository.findById(idPersonne);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		personneRepository.delete(p);
	}
	
	@Override
	public int modifierNomPersonne(String nom, int id) {
		// TODO Auto-generated method stub
		return personneRepository.modifierNomPersonne(nom, id);
	}

	

	@Override
	public Iterable<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public List<Personne> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByprenom(prenom);
	}
	@Override
	public List<Personne> rechercherParMC(String nom){
		return personneRepository.rechercherParMC("%"+nom+"%");
	}
	@Autowired
	private AdresseRepository adresseRepository;

	public AdresseRepository getAdresseRepository() {
		return adresseRepository;
	}

	public void setAdresseRepository(AdresseRepository adresseRepository) {
		this.adresseRepository = adresseRepository;
	}

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		return adresseRepository.getOne(idAdresse);
	}

	@Override
	public Optional<Adresse> affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(idAdresse);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		adresseRepository.delete(a);
	}
	@Override
	public int modifierNomRueAdresse(String nomRue, int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.modifierNomRueAdresse(nomRue, idAdresse);
	}


	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public List<Adresse> chercherParNomRue(String NomRue) {
		// TODO Auto-generated method stub
		return  adresseRepository.findByNomRue(NomRue);
	}

	@Override
	public int ajouterAdressePersonne(int idPersonne, int idAdresse) {

		 personneRepository.ajouterAdressePersonne(idPersonne, idAdresse);
		 return idPersonne;
	}

	

	

}
