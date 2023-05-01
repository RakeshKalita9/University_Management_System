package com.UniversityEventManagement.RakeshAssignmentGeekster.repository;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStudentDao extends CrudRepository<Student,Integer> {




    List<Student> findByAgeLessThan(int age);

    @Modifying
    @Query(value="update Student set Age=:age where Student_Id=:studentId" , nativeQuery = true)
    void updateStudentAge(int age, int studentId);
}
