package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Sports;
import com.example.springapp.service.ApiService;

@RestController
public class SportsController {
    @Autowired
    public ApiService apiservice;

    @PostMapping("/")
    public boolean addNew(@RequestBody Sports sports){
        return apiservice.addNew(sports);
    }

    @GetMapping("/")
    public List getAllsports(){
        return apiservice.getAllsports();
        
    }

    @GetMapping("/{sportsId}")
    public Sports getone(@PathVariable int sportsId){
        return apiservice.getone(sportsId);
    }

    @PutMapping("/{sportsId}")
    public Sports update(@PathVariable int sportsId, @RequestBody Sports sports){
        return apiservice.update(sports,sportsId);
    }

    @DeleteMapping("/{sportsId}")
    public boolean deleteone(@PathVariable int sportsId){
        return apiservice.deleteone(sportsId);
    }

    
}
