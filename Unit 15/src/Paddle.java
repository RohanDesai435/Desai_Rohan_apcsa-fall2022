//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10, 10, 50);
		speed =5;
		
		setColor(Color.BLACK);
		
   }


   
   public Paddle(int i, int j) {
	
	   
	   super(i,j , 10, 50);
	   speed = 5;
	   setColor(Color.BLACK);
}


public Paddle(int i, int j, int k) {
	
	
	 super(i,j , 10, 50);
	   speed = k;
	   setColor(Color.BLACK);
}


public Paddle(int i, int j, int k, int l, int m) {
	
	
	 super(i,j , l, m);
	   speed = k;
	   
	   setColor(Color.BLACK);
}


public Paddle(int i, int j, int k, int l, Color green, int m) {
	
	 super(i,j , l, m);
	   speed = k;
	   setColor(green);
	
}


public void moveUpAndDraw(Graphics window)
   {
	
		draw(window, Color.WHITE);

	  //setX(getX()+speed);
	  setY(getY()+speed);

	  draw(window, Color.BLACK);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
		
		  //setX(getX()-speed);
		  setY(getY()-speed);

		  draw(window, Color.BLACK);

   }

   //add get methods
   public int getSpeed() { 
	   return speed; 
   }
   
   //add a toString() method
   public String toString () { 
	   
	   return "speed is " + speed + " "+ super.toString(); 
   }
}