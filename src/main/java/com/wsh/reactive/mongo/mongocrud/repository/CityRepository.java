package com.wsh.reactive.mongo.mongocrud.repository;

import com.wsh.reactive.mongo.mongocrud.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 数据库操作类
 */

@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {

}
