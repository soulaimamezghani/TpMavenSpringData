package com.infotel.TpMavenSpringData.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;

public class App {
 public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//	 Personne f= context.getBean("personne" ,Personne.class);
//	 f.setNom("hamma");
//	 f.setPrenom("lilo");
//	 f.setAge(56);
 Iservice service =context.getBean("serviceImpl",ServiceImpl.class);	
//	 service.ajouterPersonne(f);
//	 Personne k= context.getBean("personne" ,Personne.class);
//	k.setNom("houda");
//	k.setPrenom("eiu");
//	k.setAge(78);
//	 service.ajouterPersonne(k);
////   System.out.println( service.ajouterPersonne(k));
//	 Personne x= context.getBean("personne" ,Personne.class);
//	 x.setId(4);
//	 service.supprimerPersonne(x);
////	 
 
//	 service.modifierNomPersonne("eya",7);
	
//	 System.out.println(service.findAllPersonnes());
// System.out.println(service.chercherParPrenom("salma"));
// System.out.println(service.rechercherParMC("a"));
// Adresse a= context.getBean("adresse" ,Adresse.class);
//a.setNomRue("yessamine");
//a.setNumRue("89");
//a.setCp(78888);
//a.setVille("Paris");
//service.ajouterAdresse(a);

//Adresse b= context.getBean("adresse" ,Adresse.class);
//b.setNomRue("sakietdeair");
//b.setNumRue("97");
//b.setCp(99988);
//b.setVille("Tunisie");
//service.ajouterAdresse(b);
//  service.modifierNomRueAdresse("saltnia",2);
//Adresse x= context.getBean("adresse" ,Adresse.class);
//x.setIdAdresse(4);
//service.supprimerAdresse(x);
//System.out.println(service.findAllAdresses());
//System.out.println(service.chercherParNomRue("yessamine"));
 service.ajouterAdressePersonne(7, 2);

context.close();

}
}
