
// Name - Omar Elamri

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {
	private int speed;
	private Image image;

	public Alien() {
		this(0, 0, 30, 30, 0);
	}

	public Alien(int x, int y) {
		this(x, y, 30, 30, 0);
	}

	public Alien(int x, int y, int s) {
		this(x, y, 0, 0, s);
	}

	public Alien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Couldn't load Alien");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return 0;
	}

	public void move(String direction) {
		switch (direction) {
			case "n": setY(getY() + 10);   break;
			case "s": setY(getY() - 10);   break;
			case "e": setX(getX() + 10);   break;
			case "w": setX(getX() - 10);   break;
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() {
		return "";
	}
}