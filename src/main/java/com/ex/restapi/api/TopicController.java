package com.ex.restapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {



    @GetMapping("/topics")
    public String getAllTopics() {
        return "topic 1";
    }

}
