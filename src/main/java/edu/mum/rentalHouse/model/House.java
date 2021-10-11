package edu.mum.rentalHouse.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class House extends Residence {
	private int lotSize;
	
	public House(LocalDate builtDate, int squareFt, int lotSize) {
	super(builtDate, squareFt);
	this.lotSize=lotSize;
	}

	public House() {
	}

	public int getLotSize() {
		return lotSize;
	}

	public void setLotSize(int lotSize) {
		this.lotSize = lotSize;
	}
	
	
}
