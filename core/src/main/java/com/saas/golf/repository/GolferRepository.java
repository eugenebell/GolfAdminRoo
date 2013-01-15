package com.saas.golf.repository;

import com.saas.golf.domain.Golfer;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Golfer.class)
public interface GolferRepository {

    List<com.saas.golf.domain.Golfer> findAll();
}
