/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 * Declaring objects as super classes is very helpful when u have "has a" relationships (composition)
 * but the disadvantage is you cannot call methods which are unique to the individual classes.
 *
 * @author Shruthi Routhu
 */
public class StartUpClass {
    
   public static void main(String[] args){ 
    
    // Instantiating  the classes   
    Course myAdvancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "152-135", 4.0);
    Course myIntroJavaCourse = new IntroJavaCourse("Introduction to Java", "152-125", 4.0);
    Course myIntroToProgrammingCourse = new IntroToProgrammingCourse("Introduction to Programming", "152-110", 3.0);
    
    // We cannot set prerequisites here because the objects are of type "course" and setPrerequisite()
    // method is in the subclass.
    
       System.out.println(myAdvancedJavaCourse.toString());
       System.out.println("");
       System.out.println(myIntroJavaCourse.toString());
       System.out.println("");
       System.out.println(myIntroToProgrammingCourse.toString());
       
}

}

