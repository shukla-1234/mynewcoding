import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GFG {
  
    
    public static void converter()
    {
  
        
        JFrame f = new JFrame("CONVERTER");
  
        
        JLabel k1, k2;
  
       
        JTextField a1, a2;
  
        
        JButton c1, c2, c3;
  
        
        k1 = new JLabel("Rupees:");
        k1.setBounds(20, 40, 60, 30);
        k2 = new JLabel("Dollars:");
        k2.setBounds(170, 40, 60, 30);
  
        
        a1 = new JTextField("0");
        a1.setBounds(80, 40, 50, 30);
        a2 = new JTextField("0");
        a2.setBounds(240, 40, 50, 30);
  
        
        c1 = new JButton("INR");
        c1.setBounds(50, 80, 60, 15);
        c2 = new JButton("Dollar");
        c2.setBounds(190, 80, 60, 15);
        c3 = new JButton("close");
        c3.setBounds(150, 150, 60, 30);
  
        
        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                double d
                    = Double.parseDouble(a1.getText());
  
                
                double d1 = (d / 65.25);
  
                
                String str1 = String.valueOf(d1);
  
               a2.setText(str1);
            }
        });
  
        
        c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                
                double d2
                    = Double.parseDouble(a2.getText());
  
               
                double d3 = (d2 * 65.25);
  
                 String str2 = String.valueOf(d3);
  
                
                a1.setText(str2);
            }
        });
  
        
        c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        
        
        f.add(k1);
        f.add(a1);
        f.add(k2);
        f.add(a2);
        f.add(c1);
        f.add(c2);
        f.add(c3);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    
    public static void main(String args[])
    {
        converter();
    }
}