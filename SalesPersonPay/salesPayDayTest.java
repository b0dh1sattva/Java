
/**
 * Write a description of class salesPayDayTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class salesPayDayTest
{
    public static void main( String[] args )
    {
        // initialize variables
        String f;
        String l;
        double a = 0;
        double c;
        
        // create scanner for input
        Scanner input = new Scanner( System.in );
        
        // create a salesPayDay object
        salesPayDay pd = new salesPayDay();
        
        // call setters to set variables for first name, last name, and commision rate
        System.out.print( "Enter the employee's first name: " );
        f = input.next();
        pd.setFirstName( f );
        
        System.out.print( "Enter the employee's last name: " );
        l = input.next();
        pd.setLastName( l );
        
        System.out.print( "Enter the commision rate of the employee: " );
        c = input.nextDouble();
        pd.setCommission( c );
        
        // while the user does not enter -1 call setter for totalSales
        while ( a != -1 )
        {
            System.out.print( "Enter the final sales price of a sold item or -1 to quit: ");
            a = input.nextDouble();
            if (a != -1)
            {
                pd.setTotalSales( a );
            }
        }
        
        // call getters for first name, last name, commision rate and
        // $200 + 9% of totalSales
        if ( pd.getTotalSales() > 0.00 )
            System.out.printf( "%s %s sold a total of %.2f and earned %.2f.\n", pd.getFirstName(), pd.getLastName(), pd.getTotalSales(), pd.getTotalSales()*pd.getCommission()+200 );
        else
            System.out.printf( "%s %s earned %.2f!\n", pd.getFirstName(), pd.getLastName(), 200.00 );
    }
}
