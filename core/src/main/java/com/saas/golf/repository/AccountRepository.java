package com.saas.golf.repository;

import com.saas.golf.domain.Account;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Account.class)
public interface AccountRepository {

    List<com.saas.golf.domain.Account> findAll();
}
