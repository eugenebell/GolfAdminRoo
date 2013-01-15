package com.saas.golf.repository;

import com.saas.golf.domain.ScoreCard;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = ScoreCard.class)
public interface ScoreCardRepository {

    List<com.saas.golf.domain.ScoreCard> findAll();
}
