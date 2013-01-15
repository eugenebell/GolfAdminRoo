package com.saas.golf.repository;

import com.saas.golf.domain.Competition;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Competition.class)
public interface CompetitionRepository {

    List<com.saas.golf.domain.Competition> findAll();
}
