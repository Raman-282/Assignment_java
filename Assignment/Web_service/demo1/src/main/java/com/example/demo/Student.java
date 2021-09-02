package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class Student {
   
// Get call using spring based web services   
    
   @GetMapping("/myurl")
   public String sayHello()
   {
       System.out.println("Hey");
       return "My Name is Vivek";
   }
   
//retrieve the person info using @GET Method 
   
   @GetMapping("/studentinfo")
   public StudentInfo getStudentInfo() {
   StudentInfo student =new  StudentInfo();
   
   //creating java object 
   
   student.setId(1);
   student.setName("vivek");
   student.setRollNumber("101");
   student.setMobile(875984798);
   student.setBranch("cse");
   student.setEmail("vivek@gmail.com");
   student.setAddress("Delhi");
   student.setPincode("845401");  
   return student;
   }
   
// retrieve the person information by id 
   
   @GetMapping("/studentinfo/{id}")
   public StudentInfo getStudentById(@PathVariable("id") Integer id) {
       StudentInfo student =new  StudentInfo();
       
   //creating java object 
       
   student.setId(id);
   student.setName("vivek");
   student.setRollNumber("101");
   student.setMobile(752699149);
   student.setBranch("cse");
   student.setEmail("vivek@gmail.com");
   student.setAddress("Delhi");
   student.setPincode("845401");  
   return student;
  
}
   
// add the person information Post 
   
  @PostMapping(value = "/insertpersondetails")
  public StudentInfo insertDummyPerson(@RequestBody StudentInfo student) {
  return new StudentService().addStudent(student); //calling the service
  }
  
//update person info 
  
  @PutMapping("/update")
  public StudentInfo updateStudentInfo(@RequestBody StudentInfo student) {
  return new StudentService().updateStudent(student);
  }
  
//get list 
  
  @GetMapping("/getlist")
  public List<StudentInfo> getDummyList() {
  List<StudentInfo> listOfStudent = new StudentService().getAllStudentlist();
  return listOfStudent;
  }
}
