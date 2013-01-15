package com.saas.golf.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class PlayerParticipant {

    @NotNull
    @ManyToOne
    private ScoreCard scoreCard;

    @NotNull
    @ManyToOne
    private Player player;
}
