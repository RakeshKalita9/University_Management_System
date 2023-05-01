package com.UniversityEventManagement.RakeshAssignmentGeekster.controller;

import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Department;
import com.UniversityEventManagement.RakeshAssignmentGeekster.model.Student;
import com.UniversityEventManagement.RakeshAssignmentGeekster.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
   @PostMapping("/addStudent")
    public void addStudent(@Valid  @RequestBody  Student student){
         studentService.saveStudent(student);
   }
   @GetMapping("/getAllStudent")
   public List<Student> getAllStudent(){
       return studentService.getAllStudent();
   }
         @GetMapping("/getStudent/{age}")
    public List<Student> getStudentByType(@Valid @PathVariable int age){
       return studentService.getStudentByAge(age);
     }
    @PostMapping("/addAllStudent")
    public void addAllStudent(@Valid @RequestBody List<Student> studentList){
       studentService.addAllStudent(studentList);
       }
     @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@Valid @PathVariable int id ){
         studentService.deleteStudentById(id);
           }
     //  custome query
    @PutMapping("/update/{age}/id/{studentId}")
    public void updateStudent(@PathVariable int age,@PathVariable int studentId){
       studentService.updateStudentAge(age,studentId);
    }


}
