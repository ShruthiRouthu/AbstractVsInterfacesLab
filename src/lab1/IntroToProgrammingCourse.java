package lab1;

import javax.swing.JOptionPane;

/**
 * Inherits from Abstract class "Course" .
 * Overrides the abstract method toString()
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
   
    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
       super(courseName, courseNumber,  credits);
    }

   // @override
    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits() +
                     "\nPrerequisites: None "  ;
        
        return str;
    }

 }
