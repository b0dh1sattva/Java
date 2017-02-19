
/**
 * Write a description of class DoWhileTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoWhileTest
{
    public static void main( String[] args )
    {
        int counter = 1; // initialize counter
        
        do
        {
            System.out.printf( "%d ", counter );
            ++counter;
        }while ( counter <= 10 ); // end do...while
        
        System.out.println(); // print blank line
    }
}
