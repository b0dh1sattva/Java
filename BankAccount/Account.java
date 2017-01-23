
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    private double balance; // instance variable that stores the balance
    
    // constructor
    public Account ( double initialBalance )
    {
        // validate that the initial balance is greater then 0.0
        // if it is not balance is initialized to the default value of 0.0
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    
    // credit add an amount to the account
    public void credit ( double amount )
    {
        balance = balance + amount; // add amount to balance
    }
    
    // return the account balance
    public double getBalance()
    {
        return balance; // gives the value of balnce to the calling method
    }
}
