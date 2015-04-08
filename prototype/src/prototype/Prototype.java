/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import prototype.objets.Aba;
import prototype.objets.Objet;

/**
 *
 * @author clement
 */
public class Prototype {
    
    public static Fenetre fenetre;
    public static ArrayList<Objet> entities;
    private final static int FPS = 60; //frame par seconde
    private final static int CPS = 100; //calcul par seconde
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	fenetre = new Fenetre();
        fenetre.setVisible(true);
        entities = new ArrayList<Objet>();
        new Prototype();
    }
    
    public Prototype(){
    	new Aba(0,0);
    	new Aba(50,80);
    	mainBoucle();
    }
    
    
    private class GraphicsThread extends TimerTask{
    	
    	@Override
		public void run() {
        	fenetre.canvas1.getGraphics().clearRect(0, 0, 640, 480);
            for(Objet o:entities){
            	fenetre.canvas1.getGraphics().drawImage(o.getImage(), o.getX(), o.getY(), fenetre);
            }
		}	
    }
    
    
    private class GameThread extends TimerTask{
    	@Override
		public void run() {
    		for(Objet o:entities){
            	o.step();
            }
		}
    }
    
    
    
    
    public void mainBoucle(){
    	GraphicsThread graph = new GraphicsThread();
    	GameThread game = new GameThread();
    	Timer gra = new Timer(true);
    	Timer gam = new Timer(true);
    	gra.scheduleAtFixedRate(graph,1000/FPS, 1000/FPS);
    	gam.scheduleAtFixedRate(game, 1000/CPS, 1000/CPS);
    }
    
    public static void addEntities(Objet o){
        entities.add(o);
    }
}
