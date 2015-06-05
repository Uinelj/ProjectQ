package prototype.objets;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Personnage extends Objet implements KeyListener{
	private float vspeed, hspeed;
	
	
	public Personnage(int x, int y) {
		super("ressources/2.bmp", x, y);
		vspeed = 0;
		hspeed = 0;
	}

	@Override
	public void step() {
		x += hspeed;
		y += vspeed;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// ça marche pas
	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_LEFT) {
	        hspeed = -1;
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        hspeed = 1;
	    }

	    if (key == KeyEvent.VK_UP) {
	        vspeed = -1;
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        vspeed = 1;
	    }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
