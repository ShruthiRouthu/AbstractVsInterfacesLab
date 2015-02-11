package lab1;

import javax.swing.JOptionPane;

/**
 * Inherits from Abstract class "Course" .
 * Sets the prerequisites to "none" by default in the constructor, but you have the flexibility 
 * to reset using setPrequisites() method.
 * Overrides the abstract method toString()
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
   
    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
       super(courseName, courseNumber,  credits, "none");
    }

   @Override
    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits() +
                     "\nPrerequisites: " + this.getPrerequisites() ;
        
        return str;
    }

 }
