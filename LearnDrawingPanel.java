// LearnDrawingPanel.java
// by w p osborne
// 10/18/2021
// Period 2

import java.awt.*;
import java.awt.geom.*; 
import javax.swing.*;

public class LearnDrawingPanel {

   public static void main(String[] args){
      
      DrawingPanel panel1 = new DrawingPanel(640, 480);
      
      Color myColor = Color.GREEN;
      
      // parameters of a new Color are red, green, blue.
      // range from 0 (none) to 255 (full brightness)
      Color paleYellow = new Color(255, 255, 175);
      
      panel1.setBackground(paleYellow);
      
      Graphics g = panel1.getGraphics();  // retrieves address of Graphics
                                          // object in Panel1
                                          
      // parameters x, y, width, height where x and y are the coordinates
      // of the upper-left of the bounding box
      g.drawOval(10, 15, 150, 100);
      
      g.setColor(Color.RED);
      g.fillOval(10, 200, 150, 100);
      
      g.setColor(Color.BLUE);
      
      // parameters x, y are upper-left corner, then width and height
      g.fillRect(320, 100, 200, 150);
      
      // line parameters x1,y1 and x2,y2
      g.setColor(Color.GREEN);
      g.drawLine(639, 0, 0, 479);
   }

}