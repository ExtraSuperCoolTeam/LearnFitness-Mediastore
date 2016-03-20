package com.learnxiny.mongorepository;

import com.learnxiny.models.FormMessageReply;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by spandhare on 3/20/16.
 */
public interface FormMessageReplyRepository extends MongoRepository<FormMessageReply, String> {
    List<FormMessageReply> findAllByMessageId(@Param("messageId") String messageId);
}
