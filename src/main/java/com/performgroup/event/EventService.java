package com.performgroup.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

//    private List<Event> events = new ArrayList<Event>(Arrays.asList(
//            new Event(1L, "3PA"),
//            new Event(2L, "ST"),
//            new Event(3L, "2PM")
//    ));

//    public List<Event> getEvents() {
//        return events;
//    }
//
//    public Event getEvent(Long eventId){
//        return events.stream().filter( e -> e.getEvent_id().equals(eventId)).findFirst().get();
//    }
//
//    public String addEvent(Event event) {
//        events.add(event);
//        return "Event added successfully!";
//    }
//
//
//    public String updateEvent(Long id, Event event) {
//        events = events.stream().map( e -> e.getEvent_id().equals(id) ? event : e).collect(Collectors.toList());
//        return "Event updated successfully!";
//    }
//
//    public String deleteEvent(Long id){
//        events.removeIf(e -> e.getEvent_id().equals(id));
//        return "Event deleted successfully";
//    }


    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    public Event getEvent(Long id){
        return eventRepository.findOne(id);
    }

    public String addEvent(Event event){
        return "Event added successfully!";
    }

    public String updateEvent(Long id, Event event){
        return "Event updated successfully!";

    }

    public String deleteEvent(Long id){
        return "Event deleted successfully";
    }
}
