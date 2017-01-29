
/**
 * Write a description of class GradeBookTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class GradeBookTest
{
    public static void main( String[] args )
    {
        // Create a scanner object
        //Scanner input = new Scanner( System.in );
        // Create a GradeBook object
        GradeBook gradeBook1 = new GradeBook( "Trigonometry", "Timothy" );
        // Create a second GradeBook object
        //GradeBook gradeBook2 = new GradeBook( "Algebra", "Timothy" );

        gradeBook1.displayMessage();
        gradeBook1.determineClassAverageSentinel();
        
        // display initial value of each GradeBook object
        //System.out.printf( "The initial value of gradeBook1 is %s\n\n", gradeBook1.getCourseName() );
        //System.out.printf( "The initial value of gradeBook2 is %s\n", gradeBook2.getCourseName() );            
        
        
        //gradeBook2.displayMessage();
    }
}
