package com.saas.golf.repository;

import com.saas.golf.domain.Player;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Player.class)
public interface PlayerRepository {

    List<com.saas.golf.domain.Player> findAll();
}
