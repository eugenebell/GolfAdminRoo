// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.GolfRound;
import com.saas.golf.domain.ScoreCard;
import java.util.Date;

privileged aspect GolfRound_Roo_JavaBean {
    
    public Date GolfRound.getDateCreated() {
        return this.dateCreated;
    }
    
    public void GolfRound.setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Boolean GolfRound.getInProgress() {
        return this.inProgress;
    }
    
    public void GolfRound.setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }
    
    public ScoreCard GolfRound.getScoreCard() {
        return this.scoreCard;
    }
    
    public void GolfRound.setScoreCard(ScoreCard scoreCard) {
        this.scoreCard = scoreCard;
    }
    
}