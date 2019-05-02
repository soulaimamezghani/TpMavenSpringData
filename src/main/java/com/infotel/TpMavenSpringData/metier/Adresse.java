package com.infotel.TpMavenSpringData.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Component
@Scope(value="prototype")
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int idAdresse;
 private String nomRue;
 private String numRue;
 private int cp;
 private String ville;
 @OneToMany(mappedBy="adresse")
 List<Personne>personnes=new ArrayList<Personne>();
public int getIdAdresse() {
	return idAdresse;
}
public void setIdAdresse(int idAdresse) {
	this.idAdresse = idAdresse;
}
public String getNomRue() {
	return nomRue;
}
public void setNomRue(String nomRue) {
	this.nomRue = nomRue;
}
public String getNumRue() {
	return numRue;
}
public void setNumRue(String numRue) {
	this.numRue = numRue;
}
public int getCp() {
	return cp;
}
public void setCp(int cp) {
	this.cp = cp;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
@Override
public String toString() {
	return "Adresse [idAdresse=" + idAdresse + ", nomRue=" + nomRue + ", numRue=" + numRue + ", cp=" + cp + ", ville="
			+ ville + "]";
}
 
}
