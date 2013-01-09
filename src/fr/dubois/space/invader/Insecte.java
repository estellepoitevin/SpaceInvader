// Création de la classe Insecte (insectes) 

package fr.dubois.space.invader;

import android.graphics.Bitmap;


public class Insecte extends Sprite{

	private boolean direction;
	private boolean directionBas;
	int compteur;

	public Insecte(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		
	}

	@Override
	public void act() { 
		if(x>=800){
			direction=false;
			
		}
		else if(x<=0){
			direction=true;
		}
		if(x>=800 && x<=0){
			directionBas=true;
		}
		
		
		if(direction){
			x=x-2;
		}
		else {
			x=x+2;
		}
		//compteur pour y
		if(directionBas){
			y=y+2;
			compteur++;
		}
	}
}
