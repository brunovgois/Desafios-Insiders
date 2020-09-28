package com.invillia.studentsCRUD.controller;

import com.invillia.studentsCRUD.model.StudentRepository;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;
import com.invillia.studentsCRUD.model.Student;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

  private StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @GetMapping("/students")
  Collection<Student> students() {
    return studentRepository.findAll();
  }

  @GetMapping("/student/{id}")
  ResponseEntity<?> getGroup(@PathVariable Long id) {
      Optional<Student> student = studentRepository.findById(id);
      return student.map(response -> ResponseEntity.ok().body(response))
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping("/student")
  ResponseEntity<Student> createStudent(@RequestBody Student student) throws URISyntaxException {
      System.out.println("Request to create a Student: " + student);

      Student newStudent = studentRepository.save(student);

      return ResponseEntity.created(new URI("/api/group/" + newStudent.getId()))
              .body(newStudent);
  }

  // @PutMapping("/student/{id}")
  // ResponseEntity<Student> updateStudent(@RequestBody Student studentBody, @PathVariable(value= "id") final Long id) {
  // }

  @DeleteMapping("/student/{id}")
  public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
    System.out.println("Request to delete a Student with id: " + id);
      
      studentRepository.deleteById(id);
      return ResponseEntity.ok().build();
  }


}
