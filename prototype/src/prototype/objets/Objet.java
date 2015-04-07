/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.objets;

import java.awt.Graphics;
import java.awt.Image;
import prototype.Prototype;

/**
 *
 * @author clement
 */
public abstract class Objet {
    private Image img;
    protected int x,y;
    
    public Objet(Image img, int x, int y){
        this.x = x;
        this.y = y;
        this.img = img;
        init();
    }
    private void init(){
        Prototype.addEntities(this);
    }
    
    public void paint(){
        Prototype.fenetre.getGraphics().drawImage(img,x,y,null);
    }
}
