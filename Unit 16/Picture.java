import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
  int mirrorPoint = 276;
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  int count = 0;
  Pixel[][] pixels = this.getPixels2D();

  // loop through the rows
  for (int row = 27; row < 97; row++)
  {
  // loop from 13 to just before the mirror point
  for (int col = 13; col < mirrorPoint; col++)
  {
  count++;
  leftPixel = pixels[row][col];
  rightPixel = pixels[row][mirrorPoint - col +
  mirrorPoint];
  rightPixel.setColor(leftPixel.getColor());
  }
  }
  System.out.println(count);
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void keepOnlyBlue()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  pixel = pixels[row][col];
  pixel.setRed(0);
  pixel.setGreen(0);
  }
  }
  }
  public void negate()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  pixel = pixels[row][col];
  pixel.setRed(255-pixel.getRed());
  pixel.setGreen(255-pixel.getGreen());
  pixel.setBlue(255-pixel.getBlue());
  }
  }}
  public void grayscale()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  int total = 0;
  int average = 0;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  total = 0;
  pixel = pixels[row][col];
  total = total + pixel.getRed();
  total = total + pixel.getGreen();
  total = total + pixel.getBlue();
  average = total / 3;
  pixel.setColor(new Color(average, average, average));
  }
  }
  }
  public void fixUnderwater()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  pixel = pixels[row][col];
  pixel.setRed(pixel.getRed() * 3);
  }}}
  public void keepOnlyRed()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  pixel = pixels[row][col];
  pixel.setBlue(0);
  pixel.setGreen(0);
  }
  }
  }
  public void keepOnlyGreen()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel pixel = null;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  pixel = pixels[row][col];
  pixel.setRed(0);
  pixel.setBlue(0);
  }
  }
  }
  public void mirrorVerticalRightToLeft()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  int width = pixels[0].length;
  for (int row = 0; row < pixels.length; row++)
  {
  for (int col = 0; col < width / 2; col++)
  {
  leftPixel = pixels[row][col];
  rightPixel = pixels[row][width - col - 1];
  leftPixel.setColor(rightPixel.getColor());
  }
  }
  }
  public void mirrorHorizontal()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel topPixel = null;
  Pixel botPixel = null;
  int height = pixels.length;
  for (int row = 0; row < height / 2; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  topPixel = pixels[row][col];
  botPixel = pixels[height - row - 1][col];
  botPixel.setColor(topPixel.getColor());
  }}}
  public void mirrorHorizontalBotToTop()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel topPixel = null;
  Pixel botPixel = null;
  int height = pixels.length;
  for (int row = 0; row < height / 2; row++)
  {
  for (int col = 0; col < pixels[0].length; col++)
  {
  topPixel = pixels[row][col];
  botPixel = pixels[height - row - 1][col];
  topPixel.setColor(botPixel.getColor());
  }
  }
  }
  
  public void mirrorDiagonal()
  {
  Pixel[][] pixels = this.getPixels2D();
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  // calculate the max area to mirror (min of width or height)
  int max = pixels.length;
  if (pixels[0].length < max)
  max = pixels[0].length;
  // loop through to the left of the diagonal line (row=col)
  for (int row = 1; row < max; row++)
	  for (int col = 0; col < row; col++)
	  {
	  leftPixel = pixels[row][col];
	  rightPixel = pixels[col][row];
	  rightPixel.setColor(leftPixel.getColor());
	  }
	  }
  public void mirrorArms()
  {
  Pixel topPixel = null;
  Pixel botPixel = null;
  Pixel[][] pixels = this.getPixels2D();

  // loop through the rows
  for (int row = 155; row < 191; row++)
  {
  // loop through the columns
  for (int col = 98; col < 169; col++)
  {
  topPixel = pixels[row][col];
  botPixel = pixels[191-row+191][col];
  botPixel.setColor(topPixel.getColor());
  }
  }

  // loop through the rows
  for (int row = 155; row < 191; row++)
  {
  // loop through the columns
  for (int col = 238; col < 296; col++)
  {
  topPixel = pixels[row][col];
  botPixel = pixels[191-row+191][col];
  botPixel.setColor(topPixel.getColor());
  }
  }
  }
  
  public void mirrorGull()
  {
  int mirrorPoint = 350;
 
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  Pixel[][] pixels = this.getPixels2D();

  // loop through the rows
  for (int row = 225; row < 332; row++)
  {
  // loop from 13 to just before the mirror point
  for (int col = 219; col < mirrorPoint; col++)
  {
  leftPixel = pixels[row][col];
  rightPixel = pixels[row][mirrorPoint - col +
  mirrorPoint];
  rightPixel.setColor(leftPixel.getColor());
  }
  }
  }
  
  public void copy(Picture fromPic,
		  int fromStartRow,
		 int fromStartCol,
		 int fromEndRow,
		 int fromEndCol,
		 int toStartRow,
		 int toStartCol)
		  {
		  Pixel fromPixel = null;
		  Pixel toPixel = null;
		  Pixel[][] toPixels = this.getPixels2D();
		  Pixel[][] fromPixels = fromPic.getPixels2D();
		  for (int fromRow = fromStartRow, toRow = toStartRow;
		  fromRow <= fromEndRow && toRow < toPixels.length;
		  fromRow++, toRow++)
		  {
		  for (int fromCol = fromStartCol, toCol = toStartCol;
		  fromCol <= fromEndCol && toCol < toPixels[0].length;
		  fromCol++, toCol++)
		  {
		 
		  fromPixel = fromPixels[fromRow][fromCol];
		  toPixel = toPixels[toRow][toCol];
		  toPixel.setColor(fromPixel.getColor());
		  }
		  }
		  }
  public void edgeDetection2(int edgeDist)
  {
	 
	  
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  Color rightColor = null;
	  
	  int count = 0; 
double amount =0; 
	  for (int row = 0; row < pixels.length; row++)
	  {
	  for (int col = 0; col < pixels[0].length-1; col++)
	  {
	  leftPixel = pixels[row][col];
	  count ++; 
	  amount += leftPixel.getAverage(); 
	  
	  }
	  }
	  
	  double total = amount / count; 
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
	  for (int col = 0; col < pixels[0].length-1; col++)
	  {
	  leftPixel = pixels[row][col];
	  if (leftPixel.getAverage()< total) { 
		  leftPixel.setColor(Color.WHITE);
	  }
	  
	  }
	  }
	  
	  
	  // compare pixel with to the right, if greater than edgedist than left is black and right is white
	  for (int row = 0; row < pixels.length; row++)
	  {
	  for (int col = 0; col < pixels[0].length-1; col++)
	  {
	  leftPixel = pixels[row][col];
	  rightPixel = pixels[row][col+1];
	  rightColor = rightPixel.getColor();
	  if (leftPixel.colorDistance(rightColor) > edgeDist)
	  {
	  leftPixel.setColor(Color.BLACK);
	  }
	  else
	  {
	  leftPixel.setColor(Color.WHITE);
	  }
	  }
	  }

	 
	
	  //compare pixel with the one below, if it is greater than edgeDist it becomes black
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  Color botColor = null;
	  for (int row = 0; row < pixels.length-1; row++)
	  {
	  for (int col = 0; col < pixels[0].length; col++)
	  {
	  topPixel = pixels[row][col];
	  botPixel = pixels[row+1][col];
	  botColor = botPixel.getColor();
	  if (topPixel.colorDistance(botColor) > edgeDist)
	  {
	  pixels[row][col].setColor(Color.BLACK);
	  }
	  
	  }
	 
	  }
  } 
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
