package com.saas.golf.domain;

import java.util.Date;

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
public class Account {

    @NotNull
    @Size(min = 2, max = 8)
    private String title;

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
    private Date dateCreated;

    @NotNull
    @Size(min = 2, max = 60)
    private String addressOne;

    @NotNull
    @Size(min = 2, max = 60)
    private String addressTwo;

    @NotNull
    @Size(min = 2, max = 60)
    private String addressThree;

    @NotNull
    @Size(min = 2, max = 60)
    private String town;

    @NotNull
    @Size(min = 2, max = 60)
    private String county;

    @NotNull
    @Size(min = 2, max = 20)
    private String mobile;

    @NotNull
    @Size(min = 2, max = 20)
    private String phone;

    @NotNull
    @Size(min = 2, max = 20)
    private String fax;

    @NotNull
    @Size(min = 2, max = 30)
    private String email;
}
