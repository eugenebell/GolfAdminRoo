package com.saas.golf.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
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
@RooMongoEntity//(identifierType = org.bson.types.ObjectId.class)
@RooJson
public class GolfCourse {

    @NotNull
    @Size(min = 2, max = 50)
    private String name;

    @NotNull
    @Size(min = 2)
    private String courseType;

    @NotNull
    @Min(1550L)
    @Max(2100L)
    private Integer yearBuilt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
    private Date dateCreated;

    @NotNull
    @RooUploadedFile(contentType = "image/png")
    @Lob
    private byte[] logo;

    @NotNull
    @Size(min = 2, max = 250)
    private String address;

    @NotNull
    @Size(min = 6, max = 20)
    private String phoneNumbers;

    @NotNull
    @Size(min = 6, max = 20)
    private String fax;

    @NotNull
    @Size(min = 2, max = 40)
    private String email;

    @NotNull
    @Size(min = 2, max = 40)
    private String website;

    @NotNull
    @Min(9L)
    @Max(18L)
    private Integer holes;

    @NotNull
    @Size(min = 2)
    private String designedBy;

    @NotNull
    private Boolean guestsWelcome;

    @NotNull
    private Boolean drivingRange;

    @NotNull
    private Boolean puttingGreen;

    @NotNull
    private Boolean rentalClubs;

    @NotNull
    private Boolean rentalGolfTrolley;

    @NotNull
    private Boolean enabledGPS;

    @NotNull
    private Boolean rentalGolfCart;

    @NotNull
    private Boolean proShop;

    @NotNull
    private Boolean teachingPro;

    @NotNull
    private Boolean golfSchool;

    @NotNull
    private Boolean bookingsWelcomed;

    @NotNull
    private Double priceRangeWeekdaysLow;

    @NotNull
    private Double priceRangeWeekdaysHigh;

    @NotNull
    private Double priceRangeWeekendsLow;

    @NotNull
    private Double priceRangeWeekendsHigh;

    private String otherFacilities;

    @NotNull
    @OneToOne(cascade=CascadeType.ALL)
    private ScoreCard scoreCard;
}
