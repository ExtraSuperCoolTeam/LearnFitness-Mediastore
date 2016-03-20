package com.learnxiny.mongorepository;

import com.learnxiny.models.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by spandhare on 3/20/16.
 */
public interface TrainerInfoRepository extends MongoRepository<Trainer, String> {
}
