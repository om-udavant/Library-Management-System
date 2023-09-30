

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;
    
        public AboutUs() {
            
            super("About Us - Code for Interview");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v5.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : SEB");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            
            
            JLabel l11 = new JLabel("Back");
        	l11.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				setVisible(false);
        				Home home = new Home();
        				home.setVisible(true);
        			}
        		});
        	l11.setForeground(Color.GRAY);
        	l11.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        	ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.png"));
            Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                ImageIcon i9 = new ImageIcon(i8);
                l11.setIcon(i9);
        	l11.setBounds(30, 20, 72, 33);
        	contentPane.add(l11);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        
        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
        

}

