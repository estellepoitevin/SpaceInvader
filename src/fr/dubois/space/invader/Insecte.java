// Création de la classe Insecte (insectes) 

package fr.dubois.space.invader;

import android.graphics.Bitmap;


public class Insecte extends Sprite{

	public Insecte(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		
	}

	@Override
	public void act() { 
		if(x==0){
			x=x+10;
		}
		if(x==800){
			x=x-10;
		}
	}
}
