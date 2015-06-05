import java.awt.Dimension;

import javax.swing.JFrame;

/** Main is a subclass of JFrame, creates the window which will house the JPanel (which displays graphics)
 * 
 * @author Andrea Gonzales
 *
 */
public class Main extends JFrame {

	Land land;

	public Main() {
		land = new Land();
		
		/** Methods that I find to be very important */
		setPreferredSize(new Dimension(500,700)); //only takes Dimension instances
		getContentPane().add(land); //not entirely sure why, but it makes sure to add the JPanel at the upper left corner of frame
		setVisible(true); //so you can see
		pack(); //causes the window to fit the dimensions of its subcomponents
		setResizable(false);
	}

	public static void main (String[] args) {
		Main game = new Main();
	}
	
}
