package com.tunisair.microservice.avionservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AvionRepository extends JpaRepository<Avion, Integer> {
	@Query("select c from Avion c where c.ref like :ref")
	public Page<Avion> avionByNom(@Param("ref") String n, Pageable pageable);
	   
}
