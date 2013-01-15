package com.saas.golf.repository;

import com.saas.golf.domain.GolfRound;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = GolfRound.class)
public interface GolfRoundRepository {

    List<com.saas.golf.domain.GolfRound> findAll();
}
