package edu.mum.rentalHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.rentalHouse.model.Residence;

@Repository
public interface ResidenceRepository extends JpaRepository<Residence,Long> {
	
}
