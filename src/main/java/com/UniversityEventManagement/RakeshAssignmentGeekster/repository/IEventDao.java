package com.UniversityEventManagement.RakeshAssignmentGeekster.repository;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventDao extends CrudRepository<Event,Integer> {
    @Modifying
    @Query(value = "update Event set Event_Name=:eventName where Event_Id= :eventId", nativeQuery = true)
    void updateEventNameById(int eventId, String eventName);

    List<Event> getAllEventByDate(String date);

    List<Event> findByDate(String date);


    @Query(value = "Select * from Event where date = :date ",nativeQuery = true)
    List<Event> findAllByDate(String date);
}
