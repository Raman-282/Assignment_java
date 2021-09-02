
package com.example.demo;

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class StudentService {

 

static HashMap<Integer, StudentInfo> studentIdMap = getStudentIdMap(); // map list

 

public StudentService() {
if (studentIdMap == null) {
studentIdMap = new HashMap<Integer, StudentInfo>();

 

// Creating some objects of Student while initializing
StudentInfo GermanyStudent = new StudentInfo(1, "Aman", "aman@gmail.com", "mumbai", "CS", "20",
738900693, "222105");
StudentInfo IndiaStudent = new StudentInfo(2, "Ankit", "ankit@gmail.com", "delhi", "IT", "16",
876798969, "11111");
StudentInfo nepalStudent = new StudentInfo(3, "Himanshu", "himanshu@gmail.com", "noida", "ME", "25",
913939494, "45637");
StudentInfo bhutanStudent = new StudentInfo(4, "Sahil", "sahil@gmail.com", "Greater Noida", "EEE", "11",
898548538, "67584");

 

// adding map list of collections in java
studentIdMap.put(1, GermanyStudent);
studentIdMap.put(4, IndiaStudent);
studentIdMap.put(3, nepalStudent);
studentIdMap.put(2, bhutanStudent);
}
}

 

public List<StudentInfo> getAllStudentlist() {
List<StudentInfo> personlist = new ArrayList<StudentInfo>(studentIdMap.values());
return personlist;
}

 

public StudentInfo getStudent(int id) {
StudentInfo Student = studentIdMap.get(id);
return Student;
}

 

// add student
public StudentInfo addStudent(StudentInfo student) {
student.setId(getMaxId() + 1);
// key , value
studentIdMap.put(student.getId(), student); /// logic class
return student;
}

 

//update
public StudentInfo updateStudent(StudentInfo student) {
if (student.getId() <= 0)
return null;
studentIdMap.put(student.getId(), student);
return student;

 

}
//delete

 

public void deleteStudent(int id) {
studentIdMap.remove(id);
}

 

public static HashMap<Integer, StudentInfo> getStudentIdMap() {
return studentIdMap;
}

 

// Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : studentIdMap.keySet()) {
if (max <= id)
max = id;

 

}
return max;
}
}