// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.Account;
import com.saas.golf.domain.Competition;
import com.saas.golf.domain.GolfSociety;
import com.saas.golf.domain.Player;
import java.util.Date;
import java.util.Set;

privileged aspect GolfSociety_Roo_JavaBean {
    
    public String GolfSociety.getSocietyName() {
        return this.societyName;
    }
    
    public void GolfSociety.setSocietyName(String societyName) {
        this.societyName = societyName;
    }
    
    public Date GolfSociety.getDateCreated() {
        return this.dateCreated;
    }
    
    public void GolfSociety.setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Account GolfSociety.getAccount() {
        return this.account;
    }
    
    public void GolfSociety.setAccount(Account account) {
        this.account = account;
    }
    
    public Set<Competition> GolfSociety.getCompetitions() {
        return this.competitions;
    }
    
    public void GolfSociety.setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }
    
    public Set<Player> GolfSociety.getPlayers() {
        return this.players;
    }
    
    public void GolfSociety.setPlayers(Set<Player> players) {
        this.players = players;
    }
    
}
