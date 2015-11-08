import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/** Land object is a subclass of JPanel. 
 * This is what populates the JFrame
 * Graphics are drawn in the JPanel--like a "canvas" (but not Java Canvas)
 *  
 * @author Andrea Gonzales
 *
 */
public class Land extends JPanel{
	/** static ints are easy to access across classes, esp. when doing "wall collision"*/
	static final int BOARD_WIDTH = 500;
	static final int BOARD_HEIGHT = 700;	
	Ball ball; 

	public Land() {		
		ball = new Ball();	
		
		/** Methods that I find to be very important */
		setSize(BOARD_WIDTH, BOARD_HEIGHT);
		setFocusable(true);
		addKeyListener(ball); //adds the KeyListener of Ball object (see Ball)
		repaint();
		
	}
	
	public void paint (Graphics g) {	
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT); //comment this out and see what happens!
		ball.paint(g); //calls paint method of Ball to draw ball
		update(); //needed to continue paint loop
	}
	
	public void update() {		
		repaint(); //refreshes and redraws all graphics
	}
}
