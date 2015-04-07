/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import prototype.objets.Objet;

/**
 *
 * @author clement
 */
public class Prototype {
    
    public static Fenetre fenetre;
    public static ArrayList<Objet> entities;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fenetre = new Fenetre();
        fenetre.setVisible(true);
        entities = new ArrayList();
    }
    
    public static void mainBoucle(){
        boolean cont = true;
        while(cont){
            for(Objet o:entities){
                o.paint();
            }
            
        }
    }
    
    public static void addEntities(Objet o){
        entities.add(o);
    }
}
