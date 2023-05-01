package com.UniversityEventManagement.RakeshAssignmentGeekster.service;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Event;
import com.UniversityEventManagement.RakeshAssignmentGeekster.repository.IEventDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventDao iEventDao;
    public void addStudents(List<Event> eventList) {
        iEventDao.saveAll(eventList);
    }
    @Transactional
    public void updateEventNameById(int eventId, String eventName) {
        iEventDao.updateEventNameById(eventId,eventName);
    }

    public List<Event> getAllEventsByDate(String date) {
       return iEventDao.findAllByDate(date);
    }


    public void deleteEventByName(String eventName) {
        List<Event> eventtList = (List<Event>) iEventDao.findAll();
        for(Event ele : eventtList){
            String VarEvent = ele.getEventName();
            if(VarEvent.equals(eventName)){
                iEventDao.delete(ele);
            }
        }
    }

    public List<Event> getAllEvent() {
        return (List<Event>) iEventDao.findAll();
    }
}
