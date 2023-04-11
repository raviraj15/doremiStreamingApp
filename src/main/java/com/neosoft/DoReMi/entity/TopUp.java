package com.neosoft.DoReMi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TopUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int maxDevices;
    private double TopUpPrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxDevices() {
		return maxDevices;
	}
	public void setMaxDevices(int maxDevices) {
		this.maxDevices = maxDevices;
	}
	public double getTopUpPrice() {
		return TopUpPrice;
	}
	public void setTopUpPrice(double price) {
		this.TopUpPrice = price;
	}
    
    
}