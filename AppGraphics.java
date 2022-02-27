import java.awt.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppGraphics {

   public static void main(String[] args){
     
      DrawingPanel panel1 = new DrawingPanel(640, 700);
     
      Color myColor = Color.BLUE;
     
      // parameters of a new Color are red, green, blue.
      // range from 0 (none) to 255 (full brightness)
      Color blue = new Color(100, 200, 200);
     
      panel1.setBackground(blue);
     
      Graphics g = panel1.getGraphics();
     
      headerGraph(g);
      headerTitle(g);
      motto(g);
      aboutHeaderGraph(g);
      aboutHeaderTitle(g);
      aboutWords(g);
      dataUI(g);
   }
     
      public static void headerGraph(Graphics g){
     
         //header rectangle
         g.setColor(Color.GREEN);
         g.fillRect(75,30,470,55);
         
       /* //header arcs
         g.drawArc(65, 65, 100, 65, 100, 65);
         g.setColor(Color.WHITE);
         g.fillArc(65, 65, 100, 65, 100, 65);
         
         */
         
         
      }
     
     
      public static void headerTitle(Graphics g){
     
         g.setColor(Color.WHITE);
         g.setFont(new Font("Sans",Font.BOLD,40));
         g.drawString("TRACK YOUR HEALTH!", 85, 70);
      }
     
      public static void motto(Graphics g){
         
         String know = "Know ";
         String your = "Your ";
         String body = "Body";
         String health = "Health";
         
         Font font = new Font("Ink Free",Font.BOLD,20);
         
         g.setColor(Color.RED);
         g.setFont(new Font("Ink Free",Font.BOLD,20));
         g.drawString(know + your + body, 230, 113);
         
         g.setColor(Color.RED);
         g.setFont(new Font("Ink Free",Font.BOLD,20));
         g.drawString(know + your + health, 225, 140);
     
      }
     
      public static void aboutHeaderGraph(Graphics g){
     
         int xcord = 153;
         int ycord = 262;
         
         for(int i = 153; i < 414; i+=52){
            g.setColor(Color.WHITE);
            g.fillArc(xcord, ycord, 50, 50, 0, 180);
            xcord+=52;
         }
         
         xcord = 153;
         ycord = 305;
         
         for(int i = 153; i < 414; i+=52){
            g.setColor(Color.WHITE);
            g.fillArc(xcord, ycord, 50, 50, 0, -180);
            xcord+=52;
         }
         
         g.setColor(Color.WHITE);
         g.fillArc(128, 287, 50, 42, 90, 180);
         
         g.setColor(Color.WHITE);
         g.fillArc(438, 287, 50, 42, 90, -180);
         
         g.setColor(Color.WHITE);
         g.fillRect(153, 287, 310, 43);
         
         
               
      }
     
      public static void aboutHeaderTitle(Graphics g){
     
         g.setColor(Color.ORANGE);
         g.setFont(new Font("Sans",Font.BOLD,25));
         g.drawString("WHAT WE HELP YOU DO", 155, 320);
     
      }
     
      public static void aboutWords(Graphics g){
     
         g.setColor(Color.ORANGE);
         g.setFont(new Font("Sans",Font.BOLD,15));
         g.drawString("This is an App that helps enables you to track your Health", 110, 377);
         g.drawString(" This App is designed to help inform you about your body  ", 110, 397);
         g.drawString("  Regardless of your physic we provide a precise result ", 110, 417);
         g.drawString("   We use medically proven info to ensure our accuracy    ", 110, 437);
     
      }
     
      public static void dataUI(Graphics g){
         
     
     
      }
             

 
     

     
     
     /* g.setColor(Color.RED);
      g.fillOval(10, 200, 150, 100);
     
     
      g.setColor(Color.GREEN);
      g.drawLine(639, 0, 0, 479);
     
      g.setColor(Color.GREEN);
      g.fillRect(220, 175, 200, 150);

      Polygon p = new Polygon();
      p.addPoint(320, 81);
      p.addPoint(420, 175);
      p.addPoint(220, 175);
      g.fillPolygon(p);
     
      g.setColor(Color.RED);
      g.fillRect(290, 220, 50, 75);
     
      // parameters of a new Color are red, green, blue.
      // range from 0 (none) to 255 (full brightness)*/
     
      /*
      g.setColor(Color.GREEN);
      g.fillRect(220, 175, 200, 150);

      Polygon p = new Polygon();
      p.addPoint(320, 81);
      p.addPoint(420, 175);
      p.addPoint(220, 175);
      g.fillPolygon(p);
     
      g.setColor(Color.RED);
      g.fillRect(290, 220, 50, 75);
     
      g.drawArc(0, 0, 100, 100, 0, 180);
      g.setColor(Color.WHITE);
      g.fillArc(0, 0, 100, 100, 0, 180);
     
      int[] xPoints = {150,250,350};
      int[] yPoints = {300,150,300};
      g.setColor(Color.YELLOW);
      g.fillPolygon(xPoints, yPoints, 3);
      */

     
   
   

}
