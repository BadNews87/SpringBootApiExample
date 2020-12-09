package com.performgroup.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic(1L, "Spring Framework", "Framework for MVC"),
            new Topic(2L, "Bootstrap", "Frontend Framework from twitter"),
            new Topic(3L, "Hibernate", "ORM Framework")

    ));


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(Long id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public String addTopic(Topic topic){
        topics.add(topic);
        return "Topic added successfully!";
    }

    public String updateTopic(Long id, Topic topic) {
        topics = topics.stream().map(t ->t.getId().equals(id) ? topic : t).collect(Collectors.toList());
        return "Topic updated successfully!";
    }

    public String deleteTopic(Long id) {
        topics.removeIf(t -> t.getId().equals(id));
        return "Topic deleted successfully!";
    }
}
