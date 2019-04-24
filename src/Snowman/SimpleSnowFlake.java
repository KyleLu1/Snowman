package Snowman;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a SimpleSnowFlake class
public class SimpleSnowFlake extends AbstractShape
{
    public SimpleSnowFlake(int x, int y, int w, int h) {
        super(x, y, w, h, Color.WHITE, 0, 2);
    }
    
    public void draw(Graphics window)
   {
      //add code here to make a snowman
       window.drawLine(getXPos()-25,getYPos(), getXPos()+25, getYPos());
       window.drawLine(getXPos(), getYPos()+25, getXPos(), getYPos()-25);
       
   }
     
    
    public void moveAndDraw(Graphics window) {
        //draw(window,Color.BLUE);
        int offset = (int) (Math.random() * 4);
        int rnd = (int) (Math.random() * 2);
        if (rnd == 1) {
            offset = offset * -1;
        }
        setXPos(getXPos() + offset);
        setYPos(getYPos() + getYSpeed());
        draw(window);
    }
}

