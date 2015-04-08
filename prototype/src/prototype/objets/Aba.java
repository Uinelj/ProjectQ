/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.objets;

/**
 *
 * @author clement
 */
public class Aba extends Objet{
    
    public Aba(int x, int y){
        super("ressources/1.bmp", x, y);
    }
    
    @Override public void step(){
    	x+=Math.random()*100-50;
    	y+=Math.random()*100-50;
    }
}
