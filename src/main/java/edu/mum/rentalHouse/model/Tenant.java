package edu.mum.rentalHouse.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tenant {

	@Id
 	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	//@OneToMany(mappedBy="tenant", cascade=CascadeType.ALL)
	@OneToMany(mappedBy="tenant",cascade = CascadeType.ALL,orphanRemoval = true)
	List<Contract> contracts=new ArrayList<Contract>();

	@OneToMany(mappedBy="tenant",cascade = CascadeType.ALL,orphanRemoval = true)
	List<Payment> payments=new ArrayList<Payment>();

	public Tenant() {
	}

	
	public Tenant(String firstName, String lastName, String gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}
	
	
	public void addContract(Contract contract) {
			contracts.add(contract);
			   contract.setTenant(this);
			}
	
	public void addPayments(Payment payment) {
	payments.add(payment);
	payment.setTenant(this);
	}
}
