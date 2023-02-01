/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ashan
 */
public class parttTimeStudent extends Student {
    private int noOfCourse;
    public int getNoOfCourse (){
        return noOfCourse;
    }

    public parttTimeStudent(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }
    
    public void setNoOfCourse(int noOfCourse){
        this.noOfCourse = noOfCourse;
    }
}
