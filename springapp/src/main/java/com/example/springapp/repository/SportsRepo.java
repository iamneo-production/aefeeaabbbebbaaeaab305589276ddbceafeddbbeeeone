package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Sports;

@Repository
public interface SportsRepo extends JpaRepository <Sports , Integer>   {
    
}
