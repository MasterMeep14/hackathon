import javax.swing.*;
import javax.swing.border.Border;


   JButton button = new JButton("Submit");
   JTextField textField = new JTextField("Type");
   JFrame window = new JFrame("Multiple Panels");
   JPanel panel = new JPanel();  
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();
   JPanel panel4 = new JPanel();
   JLabel label = new JLabel("Panel 1");
   JLabel label2 = new JLabel("Panel 2");
   JLabel label3 = new JLabel("Panel 3");
   JLabel label4 = new JLabel("Panel 4");
   JLabel textP1 = new JLabel("Enter your height in cm in the box below and press submit:");
   JLabel textP2 = new JLabel("Enter your weight in kgs in the box below and press submit:");
   
   MultiplePanels() {


      setTitle("JPanel Creation");
      setDefeaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      setBounds(100,100,645,470);
      Border br = BorderFactory.createLineBorder(Color.BLACK);
      Container c = getContentPane();
     
      panel.setLayout(null);
      panel2.setLayout(null);
      panel3.setLayout(null);
      panel4.setLayout(null);
     
      label.setBounds(120,50,200,50);
      label2.setBounds(120,50,200,50);
      label3.setBounds(120,50,200,50);
      label4.setBounds(120,50,200,50);
      panel.add(label);
      panel2.add(label2);
      panel3.add(label3);
      panel4.add(label4);
     
      panel.setBackground(Color.YELLOW);
      panel.setBounds(10,10,300,200);
     
      panel2.setBackground(Color.RED);
      panel2.setBounds(320,10,300,200);
     
      panel3.setBackground(Color.GREEN);
      panel3.setBounds(10,220,300,200);
     
      panel4.setBackground(Color.CYAN);
      panel4.setBounds(320,220,300,200);
     
     
      panel.setBorder(br);
      panel2.setBorder(br);
      panel3.setBorder(br);
      panel4.setBorder(br);
     
      c.add(panel);
      c.add(panel2);
      c.add(panel3);
      c.add(panel4);
     
      setVisible(true);
   }



