
/**
 * Write a description of class HeartRateTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class HeartRateTest
{
    public static void main( String[] args )
    {
        // prompt user for information
        String f = JOptionPane.showInputDialog( "Enter your first name." );
        String l = JOptionPane.showInputDialog( "Enter your last name." );
        int m = Integer.parseInt(JOptionPane.showInputDialog( "Enter your month of birth (mm)." ));
        int d = Integer.parseInt(JOptionPane.showInputDialog( "Enter your day of birth (dd)." ));
        int y = Integer.parseInt(JOptionPane.showInputDialog( "Enter your year of birth (yyyy)." ));
        
        HeartRates hr = new HeartRates();
        hr.setFirstName( f );
        hr.setLastName( l );
        hr.setMonth( m );
        hr.setDay( d );
        hr.setYear( y );
        
        JOptionPane.showMessageDialog( null, "Welcome " + hr.getFirstName() + " " + hr.getLastName() + " your age is calculated as " +
            hr.calcAge() + " Your max heart rate is " + hr.maxRate() + " your target heart rate is between " + hr.targetRateLower() +
            " and " + hr.targetRateUpper() + "!" );
    }
}
