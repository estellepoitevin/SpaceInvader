package fr.dubois.space.invader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class Sprite {
	
	protected Bitmap bitmap;
	protected float x;
	protected float y;
	protected Paint paint;

	public Sprite(Bitmap bitmap,float x,float y) {
		this.bitmap = bitmap;
		this.x = x;
		this.y = y;
		paint = new Paint();
	}

	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, paint);
	}
	
	public RectF getBbox(){
		return new RectF(x,y,x+bitmap.getWidth()-1,y+bitmap.getHeight()-1); 
	}
	


	  public abstract void act();

	  

}
//Créer une classe Alien héritant de la classe Sprite, en définissant
//la méthode act (qui est abstraite dans Sprite) et le constructeur. 
//Les versions créées par défaut par eclipse sont suffisantes pour l’instant.

//Créez un champ de type Alien dans la vue. 
//Ce champ sera initialisé dans la méthode init()

//Dans la méthode onDraw, demandez à l’alien de s’afficher sur le canevas (canvas).

//Vérifiez l’effet produit en consultant main.xml dans l’éditeur graphique 
//(Si rien ne s’affiche, essayez de varier les coordonnées. 
//En cas d’erreur dans l’éditeur graphique, tentez de lancer l’application).

	/*public class Kame extends Sprite{
		kameView=init();
		
	}*/
	
