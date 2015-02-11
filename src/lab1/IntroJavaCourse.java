package lab1;

import javax.swing.JOptionPane;

/**
 * Inherits from Abstract class "Course" .
 * Overrides the abstract method toString()
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
       
    

    //Constructor
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
         super(courseName, courseNumber,credits,prerequisites);
    }
    
    @Override
    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits() +
                     "\nPrerequisites " + this.getPrerequisites() ;
        
        return str;
    }


}
