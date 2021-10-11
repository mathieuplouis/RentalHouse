package edu.mum.rentalHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.rentalHouse.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

}
