package com.learnxiny.mongorepository;

import com.learnxiny.models.FormMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by spandhare on 3/19/16.
 */
public interface FormMessageRepository extends MongoRepository<FormMessage, String> {
}
