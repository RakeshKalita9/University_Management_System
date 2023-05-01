package com.UniversityEventManagement.RakeshAssignmentGeekster.controller;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Event;
import com.UniversityEventManagement.RakeshAssignmentGeekster.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping("/event")
    public List<Event> getAllEevent(){
        return eventService.getAllEvent();
    }
   @PostMapping("/addEvent")
    public void addEvent(@RequestBody List<Event> eventList){
    eventService.addStudents(eventList);
   }
    @PutMapping("/updateEvent/eventId/{eventId}/eventName/{eventName}")
    public void updateEvent(@PathVariable int eventId,@PathVariable String eventName ){
       eventService.updateEventNameById(eventId,eventName);
    }
    @GetMapping("/getAllEvents/{date}")
    public List<Event> getAllEvents(@PathVariable String date){

        return eventService.getAllEventsByDate(date);
    }
    @DeleteMapping("/delete/{eventName}")
    public void deleteEvent(@PathVariable String eventName){
     eventService.deleteEventByName(eventName);
    }
}
