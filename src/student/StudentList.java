/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ashan
 */
public class StudentList {
    
public static void main (String[] args)  {
    Student s1 = new Student ("s1","ashanti");
    Student[] studentList = new Student[3]; 
     Student[0] studentList = new Student["s1", "ashanti"] ; 
      Student[1] studentList = new Student["s2", "bill"] ; 
       Student[2] studentList = new Student["s3, "james"]; 
       
    for (int i = 0 ; i < studentList.length ; i++ ){
        System.out.println(studentList[i].getStudentName());
    }
}  
}
