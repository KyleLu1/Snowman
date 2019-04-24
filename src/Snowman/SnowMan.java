package Snowman;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
    
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman
       
       window.drawOval(350, 400, 50, 50);
       window.drawOval(352, 360, 45, 45);
       window.drawOval(362, 338, 25, 25);
       window.drawLine(352, 375, 320, 365);
       window.drawLine(397,375, 429, 365);
          
      
       
       
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}