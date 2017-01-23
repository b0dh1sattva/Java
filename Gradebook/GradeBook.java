
/**
 * Write a description of class GradeBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
}
