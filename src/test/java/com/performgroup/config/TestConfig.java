package com.performgroup.config;

import com.performgroup.topic.TopicController;
import com.performgroup.topic.TopicService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {


    @Bean
    TopicController topicController(){
        return new TopicController();
    }

    @Bean
    TopicService topicService(){
        return new TopicService();
    }
}
