package com.saas.golf.repository;

import com.saas.golf.domain.GolfClub;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = GolfClub.class)
public interface GolfClubRepository {

    List<com.saas.golf.domain.GolfClub> findAll();
}
