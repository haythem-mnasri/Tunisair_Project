package com.tunisair.microservice.chef_escaleservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChefEscaleRepository extends JpaRepository<Chef_Escale, Integer> {
	@Query("select c from Chef_Escale c where c.nom like :nom")
	public Page<Chef_Escale> chefEscaleByNom(@Param("nom") String n, Pageable pageable);
	   
}
