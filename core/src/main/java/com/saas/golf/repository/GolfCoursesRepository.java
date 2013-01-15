package com.saas.golf.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

import com.saas.golf.domain.GolfCourse;

@RooMongoRepository(domainType = GolfCourse.class)
public interface GolfCoursesRepository {

    List<GolfCourse> findAll();
    GolfCourse getCourseByName(String courseName);
}
