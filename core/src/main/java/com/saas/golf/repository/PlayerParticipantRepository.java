package com.saas.golf.repository;

import com.saas.golf.domain.PlayerParticipant;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = PlayerParticipant.class)
public interface PlayerParticipantRepository {

    List<com.saas.golf.domain.PlayerParticipant> findAll();
}
