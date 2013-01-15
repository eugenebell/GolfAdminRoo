package com.saas.golf.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class GolfCourseHole {

    @NotNull
    @Size(min = 2, max = 10)
    private String name;

    @NotNull
    @Min(3L)
    @Max(6L)
    private Integer par;

    @NotNull
    @Min(1L)
    @Max(18L)
    private Integer holeIndex;
    
    @NotNull
    @Min(1L)
    @Max(18L)
    private Integer holeNumber;

    @ManyToOne
    private ScoreCard scoreCard;

}
