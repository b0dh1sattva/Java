
/**
 * Write a description of class printCheckerBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class printCheckerBoard
{
    public static void main( String[] args )
    {
        // This program prints out a checkerboard pattern of asterisks
        
        for (int i = 0; i < 8; i++){
            if( i % 2 == 0 ){
                System.out.println( "* * * * * * * * * " );
            } else {
                System.out.println( " * * * * * * * * *" );
            }
                
        } 
    }
}
