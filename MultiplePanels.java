package test2;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class MultiplePanels extends JFrame implements ActionListener{


   JButton button = new JButton("Submit");
   JTextField textField = new JTextField("Type");
   JFrame window = new JFrame("Multiple Panels");
   JPanel panel = new JPanel();  
   JPanel panel2 = new JPanel();
   JLabel textP1 = new JLabel("Enter your height in cm in the box below and press submit:");
   JLabel textP2 = new JLabel("Enter your weight in kgs in the box below and press submit:");
   
   MultiplePanels() {

      panel.setBackground(Color.CYAN);
      panel2.setBackground(Color.DARK_GRAY);
      panel2.add(button);
      panel2.add(textField);
      textP1.setForeground(Color.ORANGE);
      textP2.setForeground(Color.BLUE);
      panel.add(textP1);
      panel.add(textP2);
      textP1.setVisible(true);
      textP2.setVisible(false);
      button.addActionListener(this);
     

      window.add(panel,BorderLayout.CENTER);
      window.add(panel2,BorderLayout.PAGE_END);
     
     
     
      window.setSize(400,400);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
     
   }
     
 
   public void actionPerformed(ActionEvent e){
     
      if(e.getSource() == button){
           System.out.println( textField.getText());
      }
      textP2.setVisible(true);
      textP1.setVisible(false);
      panel.setBackground(Color.YELLOW);
      panel2.setBackground(Color.GREEN);
     
   }
}