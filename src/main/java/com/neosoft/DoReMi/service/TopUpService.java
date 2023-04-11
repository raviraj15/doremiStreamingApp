package com.neosoft.DoReMi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.DoReMi.entity.TopUp;
import com.neosoft.DoReMi.repository.TopUpRepository;

@Service
public class TopUpService {
    @Autowired
    private TopUpRepository topUpRepository;
    
    public List<TopUp> getAllTopUps() {
        return topUpRepository.findAll();
    }
    
    public TopUp getTopUpById(Long id) {
        return topUpRepository.findById(id).orElse(null);
    }
    
    public TopUp saveTopUp(TopUp topUp) {
        return topUpRepository.save(topUp);
    }
    
    public void deleteTopUp(Long id) {
        topUpRepository.deleteById(id);
    }
}