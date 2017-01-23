
/**
 * Write a description of class comparison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class comparison
{
    public static void main( String[] args )
    {
        // Create scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        
        int number1;// first number to compare
        int number2;// second number to compare
        
        System.out.println( "Enter the first number to compare." );// prompt for first number
        number1 = input.nextInt();// read first number from user input
        
        System.out.println( "Enter the second number to compare." );// prompt for second number
        number2 = input.nextInt();// read second number from user input
        
        // if statements using comparicon operators
       if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
            
       if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
            
       if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
       
       if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
            
       if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
            
       if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
    }
}
