package com.UniversityEventManagement.RakeshAssignmentGeekster.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @NotBlank(message = "FirstName cannot be blank")
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;

    @NotBlank(message = "LastName cannot be blank")
    private String lastName;

    @Min(value= 18)
    @Max(value= 25)
    private int age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Department department;



}
