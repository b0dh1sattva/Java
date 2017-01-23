
/**
 * Write a description of class addition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class addition
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        
        int number1;
        int number2;
        int sum;
        
        System.out.println( "Enter the first number." );
        number1 = input.nextInt();
        
        System.out.println( "Enter the second number." );
        number2 = input.nextInt();

        System.out.printf( "Sum is %d\n", (number1 + number2) );
    }
}
