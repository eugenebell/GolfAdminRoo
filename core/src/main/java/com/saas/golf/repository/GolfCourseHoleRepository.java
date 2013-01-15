package com.saas.golf.repository;

import com.saas.golf.domain.GolfCourseHole;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = GolfCourseHole.class)
public interface GolfCourseHoleRepository {

    List<com.saas.golf.domain.GolfCourseHole> findAll();
}
