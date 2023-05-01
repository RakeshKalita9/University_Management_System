package com.UniversityEventManagement.RakeshAssignmentGeekster.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId ;

    @NotBlank
    private String eventName;

    @NotBlank
    private String locationOfEvent;

     @NotBlank
     private String date;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime endTime;


}
