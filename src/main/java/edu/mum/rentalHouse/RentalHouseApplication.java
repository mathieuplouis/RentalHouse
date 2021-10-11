package edu.mum.rentalHouse;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.mum.rentalHouse.model.Address;
import edu.mum.rentalHouse.model.Contract;
import edu.mum.rentalHouse.model.House;
import edu.mum.rentalHouse.model.Payment;
import edu.mum.rentalHouse.model.Residence;
import edu.mum.rentalHouse.model.Tenant;
import edu.mum.rentalHouse.repository.ContractRepository;
import edu.mum.rentalHouse.repository.PaymentRepository;
import edu.mum.rentalHouse.repository.ResidenceRepository;
import edu.mum.rentalHouse.repository.TenantRepository;

@SpringBootApplication
public class RentalHouseApplication {

	@Autowired
	private TenantRepository repository;
	@Autowired
	private ContractRepository contratc;
	@Autowired
	private PaymentRepository payment;
	
	@Autowired
	private ResidenceRepository res;
	
	public static void main(String[] args) {
		SpringApplication.run(RentalHouseApplication.class, args);
	}

	@Bean
	CommandLineRunner test() {
	
		Contract c1=new Contract(LocalDate.of(2010, 1, 1),LocalDate.of(2011, 1, 1),300,true);
		Contract c2=new Contract(LocalDate.of(2013, 1, 1),LocalDate.of(2011, 1, 1),800,true);
		Contract c3=new Contract(LocalDate.of(2014, 1, 1),LocalDate.of(2011, 1, 1),200,true);
		Contract c4=new Contract(LocalDate.of(2015, 1, 1),LocalDate.of(2011, 1, 1),600,true);
		
		Tenant tenant=new Tenant("John","Peter", "Male", 50);
		
		Payment p1=new  Payment(4000, LocalDate.of(2011, 1, 1));
		Payment p2=new  Payment(4000, LocalDate.of(2011, 1, 1));
		
		tenant.addContract(c1);
		tenant.addContract(c2);
		tenant.addContract(c3);
		tenant.addContract(c4);
		
		tenant.addPayments(p1);
		tenant.addPayments(p2);
	
		Residence red=new House(LocalDate.of(2011, 1, 1), 3, 3);
		Address adr=new Address("jdjf","sd","ttry","rtyr");
		red.setAddress(adr);
		repository.save(tenant);
		res.save(red);
		return null;
	}
}
