package com.learnxiny.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.learnxiny.mocks.CheckMyFormMocks;
import com.learnxiny.mocks.ContentMocks;
import com.learnxiny.models.Content;
import com.learnxiny.models.FitnessForm;
import com.learnxiny.models.Week;
import com.learnxiny.mongorepository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

@RestController
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @RequestMapping("/contents")
    public Content contents() {
        return ContentMocks.getContent();
        //return contentRepository.findOne();
    }

    @RequestMapping(value = "/contents",  method = RequestMethod.POST)
    public Content postContent(@RequestBody String jsonString) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        Content content =  gson.fromJson(jsonString, Content.class);
        //Type collectionType = new TypeToken<List<Content>>(){}.getType();
        return contentRepository.save(content);
    }
}
