// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.repository;

import com.saas.golf.domain.GolfCourseHole;
import com.saas.golf.repository.GolfCourseHoleRepository;
import java.math.BigInteger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

privileged aspect GolfCourseHoleRepository_Roo_Mongo_Repository {
    
    declare parents: GolfCourseHoleRepository extends PagingAndSortingRepository<GolfCourseHole, BigInteger>;
    
    declare @type: GolfCourseHoleRepository: @Repository;
    
}
