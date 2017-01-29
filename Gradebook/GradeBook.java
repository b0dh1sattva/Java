
/**
 * Write a description of class GradeBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class GradeBook
{
    private String courseName; // course name for this gradebook
    private String instructorName; // instructor name for this course
    
    // constructor initializes courseName with string argument
    public GradeBook( String name, String iName )
    {
        courseName = name;
        instructorName = iName;
    }
        
    // method to set the course name
    public void setCourseName( String name )
    {
        courseName = name; // store the course name
    }
    
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    }
    
    // method to set the instructors name
    public void setInstructorName( String name )
    {
        instructorName = name; // store the course name
    }
    
    // method to retrieve the instructors name
    public String getInstructorName()
    {
        return instructorName;
    }
    // method displayMessage of class GradeBook
    public void displayMessage()
    {     
        // Print to console the welcome message followed by the value passed to the courseName parameter
        System.out.printf( "Welcome to the Grade Book for \n%s!\n", getCourseName() );
        System.out.printf( "\nThis course is presented by %s.\n", getInstructorName() );
    }
    
    // determine class average based on 10 grades entered by user counter controlled
    public void determineClassAverageCounter(){
        // Set total to zero
        Scanner input = new Scanner( System.in );
        int total = 0;
        int grade;
        // Set grade counter to one
        int counter = 1;
        double average;
        
        // While grade counter is less then or equal to 10
        while ( counter <= 10 ){
            // Prompt the user to enter the next grade
            System.out.print( "Enter the next grade: " );
            // Input the next grade
            grade = input.nextInt();
            // Add the grade into the total
            total = total + grade;
            // Add one to the grade counter
            counter++;
        }
        // Set the class average to the total divided by 10
        average = total/10;
        // Print the class average
        System.out.printf( "The total is %d\n", total );
        System.out.printf( "The class average is %.2f\n", average );
    }
    
    public void determineClassAverageSentinel() {
        Scanner input = new Scanner( System.in );
        // Initialize total to zero
        int total = 0;
        // Initialize counter to zero
        int counter = 0;
        int grade;
        double average;
        
        // Prompt the user to enter the first rade
        System.out.print( "Enter the first grade or -1 to quit: " );
        // Input the first grade (possible the sentinel)
        grade = input.nextInt();
        // While the user has not entered the sentinel
        while ( grade != -1 ) {
            // Add this grade into the running total
            total = total + grade;
            // Add one to the counter
            counter++;
            // Prompt the user to enter the next grade
            System.out.print( "Enter the next grade or -1 to quit: " );
            // Input the next grade (possible the setinel)
            grade = input.nextInt();
        }
        // If the counter is not equal to zero
        if ( counter != 0 ) {
            // Set the average to the total divided by the counter
            average = total/counter;
            // Print the average
            System.out.printf( "The class total is %d\n", total );
            System.out.printf( "The class average is %.2f\n", average );
        } else
            // Print no grades were entered
            System.out.println( "No grades were entered!" );
    }
}
