package com.tunisair.microservice.chef_escaleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Chef_EscaleService {

	@Autowired
	private ChefEscaleRepository chefRepository;

	public Chef_Escale addChefEscale(Chef_Escale chefEscale) {
		return chefRepository.save(chefEscale);
	}
	public Chef_Escale updateChefEscale(int id, Chef_Escale newChefEscale) {
		if (chefRepository.findById(id).isPresent()) {
			Chef_Escale existingChefEscale = chefRepository.findById(id).get();
			
			
			existingChefEscale.setNom(newChefEscale.getNom());
			existingChefEscale.setPrenom(newChefEscale.getPrenom());
			existingChefEscale.setAge(newChefEscale.getAge());
			existingChefEscale.setAnnee_experience(newChefEscale.getAnnee_experience());
			existingChefEscale.setNationalite(newChefEscale.getNationalite());
			existingChefEscale.setSalaire(newChefEscale.getSalaire());
			existingChefEscale.setType_contrat(newChefEscale.getType_contrat());
			existingChefEscale.setSalle_embarquemment(newChefEscale.getSalle_embarquemment());

			return chefRepository.save(existingChefEscale);
		} else
			return null;
	}
	public String delete_Chef_Escale(int id) {
		if (chefRepository.findById(id).isPresent()) {
			chefRepository.deleteById(id);
			return "chef d'escale supprimé";
		} else
			return "chef d'escale non supprimé";
	}
}
