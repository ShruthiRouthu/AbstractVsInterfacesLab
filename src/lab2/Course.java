
package lab2;

/**
 * The course interface has the following abstract methods :
 * getters and setters for "CourseName" , "CourseNumber", "Credits"
 * and toString() method
 *
 * @author Shruthi Routhu
 */
public interface Course {
    
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String courseNumber);
    
    public abstract String toString();
    
}
