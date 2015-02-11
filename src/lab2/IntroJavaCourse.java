package lab2;

import javax.swing.JOptionPane;

/**
 * This class implements Course interfaces"
 *
 * @author      Shruthi Routhu
 * @version     2.00
 */
public class IntroJavaCourse implements Course {
   
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    //  Constructor
    public IntroJavaCourse(String courseName, String courseNumber ,double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

     
    // Getter and setter methods for "courseName" 
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    // Getter and setter methods for "courseNumber" 
    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
         if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    // Getter and setter methods for "credits" 
    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.0 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    // Getter and setter methods for "prerequisites" 
    public String getPrerequisites() {
        return prerequisites;
    }

    // I am not validating prerequisites to ensure the flexibility 
    // to set as none, null or  an empty space.
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits() +
                     "\nPrerequisites " + this.getPrerequisites() ;
        
        return str;
    }
}
