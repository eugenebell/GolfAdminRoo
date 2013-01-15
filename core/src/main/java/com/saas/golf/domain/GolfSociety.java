package com.saas.golf.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class GolfSociety {

    @NotNull
    @Size(max = 50)
    private String societyName;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
    private Date dateCreated;

    @NotNull
    @ManyToOne
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Competition> competitions = new HashSet<Competition>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Player> players = new HashSet<Player>();
}
