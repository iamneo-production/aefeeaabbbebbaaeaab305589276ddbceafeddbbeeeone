package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Sports;
import com.example.springapp.repository.SportsRepo;

@Service
public class ApiService {
    @Autowired
    public SportsRepo repo;

    public boolean addNew(Sports sports){
        return repo.save(sports)!=null?true:false;
    }


    public Sports getone(int sportsId){
        return repo.findById(sportsId).get();
    }

    public List<Sports> getAllsports(){
        return repo.findAll();
    } 

    public Sports update(Sports sports ,int sportsId){
        return repo.save(sports);
    }

    public boolean deleteone(int sportsId){
        repo.deleteById(sportsId);
        return true;
    }

    
}
