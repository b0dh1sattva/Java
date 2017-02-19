
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
    private int total; // sum of grades
    private int gradeCounter; // number of grades entered
    private int aCount; // count of A grades
    private int bCount; // count of B grades
    private int cCount; // count of C grades
    private int dCount; // count of D grades
    private int fCount; // count of F grades    
    
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
    
    // input arbitrary number of grades from user
    public void inputGrades()
    {
        Scanner input = new Scanner( System.in );
        
        int grade; // grade entered by user
        
        System.out.printf( "%s\n%s\n    %s\n    %s\n",
            "Enter the integer grades in the range 0-100.",
            "Type the end-of-file indicator to terminate input:",
            "On UNIX/Linux?Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter" );
        
        // loop until user enters the end-of-file indicator
        while( input.hasNext() )
        {
            grade = input.nextInt(); // read grade
            total += grade; // add grade to total
            ++gradeCounter; // increment number of grades
            
            // call method to increment appropriate counter
            incrementLetterGradeCounter( grade );
        }
    }
    
    // add 1 to appropriate counter for specified grade
    private void incrementLetterGradeCounter( int grade )
    {
        //determine which grade was entered
        switch ( grade / 10 )
        {
            case 9: // grade was between 90
            case 10: //and 100
                ++aCount; // increment aCount
                break; // necessary to exit switch
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
        }
    }
    
    // display a report based on the rades entered by the user
    public void displayGradeReport()
    {
        System.out.println( "\nGrade Report:" );
        
        // if user entered at least one grade...
        if ( gradeCounter != 0 )
        {
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;
            
            // output summary of results
            System.out.printf( "Total of the %d grades entered is %d\n", gradeCounter, total );
            System.out.printf( "Class average is %.2f\n", average );
            System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                "Number of students who received each grade:",
                "A: ", aCount,   // display number of A grades
                "B: ", bCount,   // display number of B grades
                "C: ", cCount,   // display number of C grades
                "D: ", dCount,   // display number of D grades
                "F: ", fCount ); // display number of F grades
        }
        else // no grades were entered so output appropriate message
            System.out.println( "No grades were entered" );
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
