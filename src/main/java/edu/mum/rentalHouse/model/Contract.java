package edu.mum.rentalHouse.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Contract {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="tenant_id")
	@ManyToOne
   private Tenant tenant;
	@ManyToOne
	@JoinColumn(name="residence_id")
	private Residence residence;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate startDate;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate endDate;
	
	@Column(nullable=false)
	private double amount;
	
	@Column(nullable=false)
	private boolean active;

	
	public Contract() {
	}

	public Contract(LocalDate startDate, LocalDate endDate, double amount, boolean active) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.active = active;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}
	
	
	
	
}
