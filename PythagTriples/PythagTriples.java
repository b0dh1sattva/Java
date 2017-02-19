
/**
 * Write a description of class PythagTriples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.*;

public class PythagTriples
{
    public static void main( String[] args ){
        double c;
        System.out.printf("%3s       %3s       %3s", "Side 1", "Side 2", "Hyp");
        for(int i = 1; i<500; i++){
            for(int j = 1; j<500; j++){
                c = Math.sqrt(i*i+j*j);
                if(Math.floor(c)==c && c<=500){
                    System.out.printf("%3d       %3d       %3.0f\n", i, j, c);
                }
            }
        }
    }    
}
