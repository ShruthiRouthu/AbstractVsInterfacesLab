
package lab2;

/**
 *
 * @author ShruthiRouthu
 */
public class StartUPClass {
    
    
public static void main(String[] args){
    
 // Liskov Substitution principle can be used during composition .
 // For example if a student class has a "Course" property we can assign an object of any class 
 // which implements the interface "Course"s
    
 // Using "course" Interface as a super class results in a lot of code reuse but it gives flexibility 
 // to the classs  with regards  to implementation. 

 // Instantiating  the classes
    Course myAdvancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "152-135",4.0,"Introduction to Java" );
    Course myIntroJavaCourse = new IntroJavaCourse("Introduction to Java", "152-125",4.0,"Introduction to Programming");
    Course myIntroToProgrammingCourse = new IntroToProgrammingCourse("Introduction to Programming", "152-110", 4.0);
    
//    System.out.println(myAdvancedJavaCourse.toString());
//    System.out.println("");
//    System.out.println(myIntroJavaCourse.toString());
//    System.out.println("");
//    System.out.println(myIntroToProgrammingCourse.toString());
    
    Course[] myCourses = {myAdvancedJavaCourse,myIntroJavaCourse,myIntroToProgrammingCourse};
    
    for(Course c: myCourses)
    {
        System.out.println(c.toString() + "\n");
    }
    

}

}