/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import javax.swing.JOptionPane;

/**
 * The abstract super class "course" has 3 properties(courseName,courseNumber,credits)
 * It also has fully implemented getter and setter methods for the above mentioned properties and
 * an abstract method toString() . 
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public abstract class Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    //Constructor sets courseName, courseNumber by calling their respective setter methods.
    public Course(String courseName,String courseNumber,double credits)
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    // Getter and Setter methods for courseName
    public final String getCourseName() {
        return courseName;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() <= 0 )
        {
            JOptionPane.showMessageDialog(null,
                    "Error: Invalid Course Name. ");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    // Getter and Setter methods for courseNumber
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber.length() <= 0 || courseNumber.equals(null))
        {
            JOptionPane.showMessageDialog(null,
                    "Error: Invalid Course Name. ");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
      // getter and setter methods for "credits"
    public final double getCredits() {
       return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
   
    public abstract String toString();
}
