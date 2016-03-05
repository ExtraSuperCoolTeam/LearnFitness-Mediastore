package com.learnxiny.controllers;

import com.learnxiny.mocks.ContentMocks;
import com.learnxiny.models.Content;
import com.learnxiny.models.Week;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContentController {

    @RequestMapping("/contents")
    public Content contents() {
        return ContentMocks.getContent();
    }
}
