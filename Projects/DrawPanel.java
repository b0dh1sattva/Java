
/**
 * Using drawline to connect the corners of a panel
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    // draws an x from the corner of the panel
    public void paintComponent( Graphics g )
    {
        // call paintComponent to be sure the panel displays correctly
        super.paintComponent( g );
        
        int width = getWidth();
        int height = getHeight();
        
        // draw a line from the upper left to the lower right
        g.drawLine( 0, 0, width, height );
        
        // draw a line from the lower left to the upper right
        g.drawLine( 0, height, width, 0 );
        
    }
}
