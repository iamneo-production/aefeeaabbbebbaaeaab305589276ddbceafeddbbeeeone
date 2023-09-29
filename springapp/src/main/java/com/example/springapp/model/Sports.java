package com.example.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Sports {
 @Id
int sportsId;
String nameOfSport;
int numOfPlayers;
public Sports(){

}
public Sports(int sportsId, String nameOfSport, int numOfPlayers) {
    this.sportsId = sportsId;
    this.nameOfSport = nameOfSport;
    this.numOfPlayers = numOfPlayers;
}
public int getSportsId() {
    return sportsId;
}


public void setSportsId(int sportsId) {
    this.sportsId = sportsId;
}


public String getNameOfSport() {
    return nameOfSport;
}


public void setNameOfSport(String nameOfSport) {
    this.nameOfSport = nameOfSport;
}


public int getNumOfPlayers() {
    return numOfPlayers;
}


public void setNumOfPlayers(int numOfPlayers) {
    this.numOfPlayers = numOfPlayers;
}


    
}
