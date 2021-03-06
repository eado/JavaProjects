
// Name - Omar Elamri

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;  
	
	private AlienHorde horde; private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(200, 600);

		horde = new AlienHorde(7);
 
		shots = new Bullets();

		this.addKeyListener(this);
		new Thread(this).start();   

		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window); 
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, getWidth(), getHeight()); 


		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter: Points " + horde.getGameCount(), 25, 50);
		twoDGraph.drawImage(back, null, 0, 0);

		if (keys[0] == true && ship.getX() > 0) {
			ship.move("LEFT");
		} else if (keys[1] == true && ship.getX() < getWidth()) {
			ship.move("RIGHT");
		} else if (keys[2] == true && ship.getY() > 0) {
			ship.move("UP");
		} else if (keys[3] == true && ship.getY() < getHeight()) {
			ship.move("DOWN");
		} else if (keys[4]) {
			shots.add(new Ammo(ship.getX() + 45, ship.getY()));
		}

		// add code to move Ship, Alien, etc.
		ship.draw(window);

		// add in collision detection to see if Bullets hit the Aliens and if Bullets
		// hit the Ship

		shots.drawEmAll(window);
		shots.moveEmAll();
		shots.cleanEmUp();

		horde.drawEmAll(window);
		horde.removeDeadOnes(shots.getList());
		horde.moveEmAll();
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {
		// no code needed here
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(50);
				repaint();
			}
		} catch (Exception e) {
			System.out.println("Hello");
		}
	}
}
