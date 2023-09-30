import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class StudentHome extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;
        String number;
	public static void main(String[] args) {
            new StudentHome("").setVisible(true);
	}
        
        public StudentHome(String number) {
	this.number = number;
            setBounds(400, 200, 805, 450);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(200, 40, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/third.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 134, 128);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            contentPane.add(l4);

            b1 = new JButton("Books Details");
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Statistics");
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 320, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("Logout");
            b3.addActionListener(this);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(562, 320, 167, 44);
            contentPane.add(b3);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(20, 120, 750, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

           
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new StudentBook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new StudentStatistics(number).setVisible(true);
            }
            if(ae.getSource() == b3){
            	setVisible(false);
		        new Login().setVisible(true);
            }
            
            
        }
}