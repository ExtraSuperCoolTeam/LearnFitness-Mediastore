package com.learnxiny.mongorepository;

import com.learnxiny.models.Content;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by spandhare on 3/13/16.
 */
public interface ContentRepository extends MongoRepository<Content, String> {
    //List<Content> findAll();
}
