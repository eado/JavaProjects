
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets {
	private List<Ammo> ammo;

	public Bullets() {
		for (int i = 0 ; i < size; i++) {
			add(new Ammo());
		}
	}

	public void add(Ammo al) {
		ammo.add(al);
	}

	// post - draw each Ammo
	public void drawEmAll(Graphics window) {
		for (int i = 0; i < ammo.size(); i++) {
			ammo.get(i).draw(window);
		}
	}

	public void moveEmAll() {
		for (int i = 0; i < ammo.size(); i++) {
			ammo.get(i).move("n");
		}
	}

	public void cleanEmUp() {
		for (int i = 0; i < ammo.size(); i++) {
			Ammo am = ammo.get(i);

			if (am.getX() < 0 && am.getX() > 100 && am.getY() < 0 && am.getY() > 100) {
				ammo.remove(i);
			}
		}
	}

	public List<Ammo> getList() {
		return ammo;
	}

	public String toString() {
		return "";
	}
}