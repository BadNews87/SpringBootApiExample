package com.performgroup.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/events")
    public List<Event> getALlEvents() {

        return eventService.getEvents();
    }

    @RequestMapping("/events/{id}")
    public Event getEventById(@PathVariable Long id){
        return eventService.getEvent(id);
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.PUT)
    public String updateEvent(@RequestBody Event event, @PathVariable Long id){
        return eventService.updateEvent(id, event);
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.DELETE)
    public String deleteEvent(@PathVariable Long id){
        return eventService.deleteEvent(id);
    }


}
