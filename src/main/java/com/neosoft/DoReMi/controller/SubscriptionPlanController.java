package com.neosoft.DoReMi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.DoReMi.entity.SubscriptionPlan;
import com.neosoft.DoReMi.service.SubscriptionPlanService;

@RestController
@RequestMapping("/subscription-plans")
public class SubscriptionPlanController {
    @Autowired
    private SubscriptionPlanService subscriptionPlanService;
    
   
    
    @GetMapping("/getAllSubscription")
    public List<SubscriptionPlan> getAllSubscription() {
        return subscriptionPlanService.getAllSubscriptionPlans();
    }
    @GetMapping("/getSubscriptionById/{id}")
    public SubscriptionPlan getSubscriptionById(Long id) {
        return subscriptionPlanService.getSubscriptionPlanById(id);
    }
    @PostMapping("/saveSubscriptionPlan")
    public SubscriptionPlan saveSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        return subscriptionPlanService.saveSubscriptionPlan(subscriptionPlan);
    }
    @DeleteMapping("/deleteSubscription/{id}")
    public void deleteSubscription(Long id) {
    	subscriptionPlanService.deleteSubscriptionPlan(id);
    }
    @GetMapping("/getSubscriptionByCategory")
    public List<SubscriptionPlan> getSubscriptionByCategory(String category) {
        return subscriptionPlanService.getSubscriptionPlansByCategory(category);
    }
}