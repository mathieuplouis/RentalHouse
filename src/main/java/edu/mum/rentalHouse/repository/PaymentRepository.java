package edu.mum.rentalHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.rentalHouse.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
