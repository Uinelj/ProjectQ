/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.objets;




import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import prototype.Prototype;

/**
 *
 * @author clement
 */
public abstract class Objet {
    private BufferedImage img;
    protected int x,y;
    
    public Objet(String imgLink, int x, int y){
        this.x = x;
        this.y = y;
        img = null;
        try {
            img = ImageIO.read(new File(imgLink));
        } catch (IOException e) {
        	System.out.println("Erreur du chargement de l'image "+imgLink);
        	e.printStackTrace();
        }
        init();
    }
    
    private void init(){
        Prototype.addEntities(this);
    }
    
    public BufferedImage getImage(){
        return img;
    }
    
    public int getX(){
    	return x;
    }
    
    public int getY(){
    	return y;
    }
    
    public abstract void step();
    
}
