package com.neosoft.DoReMi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * private List<SubscriptionPlan> subscribedPlans = new ArrayList(); private
	 * TopUp currentTopUp;
	 * 
	 * public void subscribe(SubscriptionPlan plan) { subscribedPlans.add(plan); }
	 * 
	 * public void addTopUp(TopUp topUp) { if (subscribedPlans.isEmpty()) { throw
	 * new RuntimeException("Cannot add top up when no subscription exists"); }
	 * 
	 * if (currentTopUp != null) { throw new
	 * RuntimeException("A top up is already applied to the account"); }
	 * 
	 * if (topUp.getMaxDevices() <= getMaxDevices()) { throw new
	 * RuntimeException("New top up must allow for more devices than the current limit"
	 * ); }
	 * 
	 * currentTopUp = topUp; }
	 * 
	 * public int getMaxDevices() { int maxDevices = 1; // start with default device
	 * limit
	 * 
	 * for (SubscriptionPlan plan : subscribedPlans) { if (plan.getMaxDevices() >
	 * maxDevices) { maxDevices = plan.getMaxDevices(); } }
	 * 
	 * if (currentTopUp != null && currentTopUp.getMaxDevices() > maxDevices) {
	 * maxDevices = currentTopUp.getMaxDevices(); }
	 * 
	 * return maxDevices; }
	 */
}