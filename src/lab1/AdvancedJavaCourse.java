package lab1;

import javax.swing.JOptionPane;

/**
 * Inherits from Abstract class "Course" .
 * Has a property "prerequisites" and a getter, setter for it.
 * Overrides the abstract method toString()
 * It also has a method "getCapitalizedCourseName()".
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    
    private String prerequisites;
    
    // constructor
    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber,credits);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

     
    // getter and setter methods for "prerequisites"
    public final  String getPrerequisites() {
        return prerequisites;
    }
  
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

     // @override
    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits() +
                     "\nPrerequisites " + this.getPrerequisites() ;
        
        return str;
    }
}
