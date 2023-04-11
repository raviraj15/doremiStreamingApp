package com.neosoft.DoReMi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.DoReMi.entity.SubscriptionPlan;
import com.neosoft.DoReMi.repository.SubscriptionPlanRepository;

@Service
public class SubscriptionPlanService {
    @Autowired
    private SubscriptionPlanRepository subscriptionPlanRepository;
    
    public List<SubscriptionPlan> getAllSubscriptionPlans() {
        return subscriptionPlanRepository.findAll();
    }
    
    public SubscriptionPlan getSubscriptionPlanById(Long id) {
        return subscriptionPlanRepository.findById(id).orElse(null);
    }
    
    public SubscriptionPlan saveSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        return subscriptionPlanRepository.save(subscriptionPlan);
    }
    
    public void deleteSubscriptionPlan(Long id) {
        subscriptionPlanRepository.deleteById(id);
    }
    
    public List<SubscriptionPlan> getSubscriptionPlansByCategory(String category) {
        return subscriptionPlanRepository.findByCategory(category);
    }
}
