
// Name - Omar Elamri

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		this(x, y, 0);
	}

	public Ammo(int x, int y, int s) {
		super(x, y);

		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.RED);
		window.fillRect(x, y, 10, 10);
	}

	public void move(String direction) {
		switch (direction) {
			case "n": setY(getY() + 10);   break;
			case "s": setY(getY() - 10);   break;
			case "e": setX(getX() + 10);   break;
			case "w": setX(getX() - 10);   break;
		}
	}

	public String toString() {
		return "";
	}
}
