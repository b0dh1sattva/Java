
/**
 * Write a description of class HeartRates here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartRates
{
    // attributes should contain first name, last name, date of birth consisting of
    // seperate attributes for month, day and year of birth.
    String fName;
    String lName;
    int month;
    int day;
    int year;
    int age;
    int mRate;
    
    // constructor that receives the above attributes as parameters
    // remember constructor should be named the same as the class
    public void HeartRate( String firstName, String lastName, int mon, int d, int y )
    {
        fName = firstName;
        lName = lastName;
        month = mon;
        day = d;
        year = y;
    }
    // setter and getter for each attribute
    public void setFirstName( String name )
    {
        fName = name;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public void setLastName( String name )
    {
        lName = name;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public void setMonth( int m )
    {
        month = m;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public void setDay( int d )
    {
        day = d;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public void setYear( int y )
    {
        year = y;
    }
    
    public int getYear()
    {
        return year;
    }
    
    // method that calculates and returns the persons age in years
    public int calcAge()
    {
        age = 2017 - year;
        return age;
    }
    
    // method that calculates and returns a persons maximum heartrate
    // using formula of 220-age in years
    public int maxRate()
    {
        mRate = 220 - age;
        return mRate;
    }
    
    // method that calculates and returns a person target heart rate
    // using formula for range of 50%-85% of maximum heart rate
    public double targetRateLower()
    {
        double tRateLower = mRate * .50;
        return tRateLower;
    }
    
    public double targetRateUpper()
    {
        double tRateUpper = mRate * .85;
        return tRateUpper;
    }
}
