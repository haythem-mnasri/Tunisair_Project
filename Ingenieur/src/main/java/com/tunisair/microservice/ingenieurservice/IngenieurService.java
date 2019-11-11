package com.tunisair.microservice.ingenieurservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngenieurService {

	@Autowired
	private IngenieurRepository ingenieurRepository;

	public Ingenieur addIngenieur(Ingenieur ingenieur) {
		return ingenieurRepository.save(ingenieur);
	}
	public Ingenieur updateIngenieur(int id, Ingenieur newIngenieur) {
		if (ingenieurRepository.findById(id).isPresent()) {
			Ingenieur existingIngenieur = ingenieurRepository.findById(id).get();
			
			
			existingIngenieur.setNom(newIngenieur.getNom());
			existingIngenieur.setPrenom(newIngenieur.getPrenom());
			existingIngenieur.setAge(newIngenieur.getAge());
			existingIngenieur.setAnnee_experience(newIngenieur.getAnnee_experience());
			existingIngenieur.setNationalite(newIngenieur.getNationalite());
			existingIngenieur.setSalaire(newIngenieur.getSalaire());
			existingIngenieur.setSpecialite(newIngenieur.getSpecialite());
			existingIngenieur.setType_contrat(newIngenieur.getType_contrat());
			

			return ingenieurRepository.save(existingIngenieur);
		} else
			return null;
	}
	public String deleteIngenieur(int id) {
		if (ingenieurRepository.findById(id).isPresent()) {
			ingenieurRepository.deleteById(id);
			return "ingenieur supprimé";
		} else
			return "ingenieur non supprimé";
	}
}
