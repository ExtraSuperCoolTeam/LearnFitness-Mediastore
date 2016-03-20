package com.learnxiny.mongorepository;

import com.learnxiny.models.Counter;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by spandhare on 3/19/16.
 */
public interface CounterRepository extends MongoRepository<Counter, String> {
}
