//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	protected int width;
	protected int height;

	private Color color;

	
	
	public Block() {
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.GREEN;
	}
	public Block(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		width = 10;
		height = 10;
		color = Color.GREEN;
	}

	public Block(int xPos, int yPos, int width, int height) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		color = Color.GREEN;
	}
	
	public Block(int xPos, int yPos, int width, int height, Color c) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		color = c;
	}


	
	
	
	
	
	
	public void setPos( int x, int y) { 
		xPos = x; 
		yPos = y;
	}
    public void setX( int x ) { 
    	xPos = x; 
    }
    public void setY( int y ) {
    	yPos = y;
    }
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col; 

   }
   public Color getColor() {
	   return color;
   }
   public void draw(Graphics window)
   {
   	
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   draw(window);

   }
   
	public boolean equals(Object obj)
	{




		return this==obj;
	}   

   //add the other get methods
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

    public int getX() {
    	return xPos; 
    }
    public int getY() {
    	return yPos; 
    }
   //add a toString() method  - x , y , width, height, color
    public String toString() { 
    	return "x is " + xPos + " y is " + yPos+ " width is " + width + " height is " + height + " color is " + color; 
    }
}