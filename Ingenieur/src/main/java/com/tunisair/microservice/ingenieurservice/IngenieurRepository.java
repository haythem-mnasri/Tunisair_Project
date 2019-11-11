package com.tunisair.microservice.ingenieurservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IngenieurRepository extends JpaRepository<Ingenieur, Integer> {
	@Query("select c from Ingenieur c where c.nom like :nom")
	public Page<Ingenieur> ingenieurByNom(@Param("nom") String n, Pageable pageable);
	   
}
