import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/** A Ball object shows basic keyListener functions
 * 
 * @author Andrea Gonzales
 *
 */
public class Ball implements KeyListener{
	private int x;
	private int y;
	private int size;
	private int speed;
	
	//if you're daring and want to use images
	private BufferedImage image;
	
	/** Constructor sets ball size to arbitrary amounts; do what you want, it's a free country
	 * 
	 */
	public Ball() {
		x = 100;
		y = 100;
		
		//for drawing a ball
		size = 20;
		speed = 5;
		
		//initializes image w/ new file found in root directory 
		//(but can access from other directories w/i project w/ different path string)
		try {
			image = ImageIO.read(new File("image.png")); //this image does not exist, expect IOException
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param g Graphics need to be passed in to draw anything. Must also import the Graphics library
	 */
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillOval(x, y, size, size); //one of many shapes that can be drawn
		//g.drawImage(image, x, y, image.getWidth(), image.getHeight(), null); //<-- to draw an image instead, null is an observer
	}

	/**
	 * KeyListeners take input from the keyboard. 
	 * Note that there will be lag for the code below--
	 * To help eliminate that, use a flag to signal when movement occurs. Then call the movement in the draw/update/paint function
	 */
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}	
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {// gets ASCII code from key pressed
		case KeyEvent.VK_UP: //ASCII codes stored in KeyEvent library, makes life easier for you
			y -= speed;
			break;
		case KeyEvent.VK_DOWN: 
			y += speed;
			break;
		case KeyEvent.VK_LEFT: 
			x -= speed;
			break;
		case KeyEvent.VK_RIGHT: 
			x += speed;
			break;
		default: 
			y += 0;
			x += 0;
			break;
		}
	}
}
