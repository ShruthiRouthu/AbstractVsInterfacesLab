package lab2;

import javax.swing.JOptionPane;

/**
 * This class implements Course interface and 
 * doesn't have "prerequisites" property.
 * 
 *
 * @author      Shruthi Routhu
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    // Constructor
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    // Getter and setter methods for "courseName" 
    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
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
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String toString()
    {
        String str = "Course Name: " + this.getCourseName() +
                     "\nCourse Number: " + this.getCourseNumber() +
                     "\nCredits: " + this.getCredits()  ;
        
        return str;
    }
    
}
