
/**
 * Write a description of class salesPayDay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salesPayDay
{
    // attributes should contain first name, last name, commision rate, and totalSales
    String fName;
    String lName;
    double totalSales;
    double commision; 
    
    // constructor that receives the above attributes as parameters
    public void salesPayDay( String firstName, String lastName, double total, double rate )
    {
        fName = firstName;
        lName = lastName;
        totalSales = total;
        commision = rate;
    }
    // setter and getter for each atrribute
    public void setFirstName ( String name )
    {
        fName = name;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public void setLastName ( String name )
    {
        lName = name;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public void setTotalSales ( double sales )
    {
        totalSales = totalSales + sales;
    }
    
    public double getTotalSales()
    {
        return totalSales;
    }
    
    public void setCommission ( double rate )
    {
        commision = rate;
    }
    
    public double getCommission()
    {
        return commision;
    }
}
