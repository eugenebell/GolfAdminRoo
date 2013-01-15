package com.saas.golf.repository;

import com.saas.golf.domain.GolfSociety;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = GolfSociety.class)
public interface GolfSocietyRepository {

    List<com.saas.golf.domain.GolfSociety> findAll();
}
