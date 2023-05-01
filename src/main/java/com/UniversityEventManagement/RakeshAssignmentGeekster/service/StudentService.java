package com.UniversityEventManagement.RakeshAssignmentGeekster.service;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Student;
import com.UniversityEventManagement.RakeshAssignmentGeekster.repository.IStudentDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentDao iStudentDao;




    public List<Student> findAll() {
       return (List<Student>) iStudentDao.findAll();
    }

    public void saveStudent(Student student) {
         iStudentDao.save(student);
    }

    public List<Student> getAllStudent() {
        return (List<Student>) iStudentDao.findAll();
    }

    public List<Student> getStudentByAge(int age) {
        return iStudentDao.findByAgeLessThan(age);
    }

    public void addAllStudent(List<Student> studentList) {
        iStudentDao.saveAll(studentList);
    }

    public void deleteStudentById(int id) {
        iStudentDao.deleteById(id);
    }
   @Transactional
    public void updateStudentAge(int age, int studentId) {
        iStudentDao.updateStudentAge(age,studentId);
    }

}
