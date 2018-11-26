
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

public class AlienHorde {
	private List<Alien> aliens;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		int x = 10;
		for (int i = 0 ; i < size; i++) {
			add(new Alien(x, 100)); 

			x += 100;
		}
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll() {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < aliens.size(); i++) {
			Alien al = aliens.get(i);

			for (int t = 0; t < shots.size(); t++) {
				Ammo sh = shots.get(t);

				if ((sh.getX() > al.getX() && sh.getX() < al.getX() + 100) && (sh.getY() > al.getY() && sh.getY() < al.getY() + 100)) {
					aliens.remove(i);
				}
			}
		}
	}

	public String toString() {
		return "";
	}
}
