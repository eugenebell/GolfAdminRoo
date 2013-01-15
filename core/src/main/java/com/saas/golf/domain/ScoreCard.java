package com.saas.golf.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class ScoreCard {

    @NotNull
    @Size(min = 2, max = 20)
    private String name;

    @NotNull
    @Min(68L)
    @Max(74L)
    private Integer par;

    @NotNull
    @Min(1000L)
    private Integer courseLengthYards;
    
    @NotNull
    @Min(1000L)
    private Integer courseLengthMeters;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
    private Date dateCreated;

    @NotNull
    @Size(min = 2, max = 20)
    private String teeColor;

    @NotNull
    @RooUploadedFile(contentType = "image/png")
    @Lob
    private byte[] courseMap;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="scoreCard")
    private Set<GolfCourseHole> golfCourseHoles = new HashSet<GolfCourseHole>();
   
}
