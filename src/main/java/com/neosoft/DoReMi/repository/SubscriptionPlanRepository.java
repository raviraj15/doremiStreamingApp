package com.neosoft.DoReMi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.DoReMi.entity.SubscriptionPlan;

public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlan, Long>{

	List<SubscriptionPlan> findByCategory(String category);

}
