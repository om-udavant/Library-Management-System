import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener{
	
	JLabel l1, l2;
	JRadioButton r1, r2;
	ButtonGroup g1 = new ButtonGroup();
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	
	Login(){
		setLayout(null);
		setBounds(550,250,380,350);
		getContentPane().setBackground(new Color(204,204,204));
		
		l1 = new JLabel("ID");
		l1.setBounds(30, 20, 100, 25);
		l1.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(30, 50, 300, 30);
		t1.setBorder(BorderFactory.createEmptyBorder());
		add(t1);
		
		l2 = new JLabel("Password");
		l2.setBounds(30, 100, 100, 25);
		l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		add(l2);
		
		t2 = new JPasswordField();
		t2.setBounds(30, 130, 300, 30);
		t2.setBorder(BorderFactory.createEmptyBorder());
		add(t2);
		
		r1 = new JRadioButton("Admin");
		r1.setBackground(Color.WHITE);
		r1.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		r1.setBackground(new Color(204,204,204));
		r1.setBounds(30, 190, 100, 30);
		g1.add(r1);
		add(r1);
		
		r2 = new JRadioButton("Student");
		r2.setBackground(Color.WHITE);
		r2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		r2.setBackground(new Color(204,204,204));
		r2.setBounds(150, 190, 100, 30);
		g1.add(r2);
		add(r2);
		
		b1 = new JButton("Login");
		b1.setBounds(30, 250, 130, 30);
		b1.setBackground(new Color(133, 193, 233));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Exit");
		b2.setBounds(200, 250, 130, 30);
		b2.setBackground(new Color(133, 193, 233));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource() == b1) {
			try {
				
			Conn c = new Conn();
			if(r1.isSelected()) {
				String sql = "select * from teacher where teacher_id=? and password=?";
                PreparedStatement st = c.c.prepareStatement(sql);

                st.setString(1, t1.getText());
                st.setString(2, t2.getText());

                ResultSet rs = st.executeQuery();				
                if(rs.next()) {
    				this.setVisible(false);
    				new Loading().setVisible(true);
    			}else {
    				JOptionPane.showMessageDialog(null, "Invalid Tracher Login.");
    			}
			}else if(r2.isSelected()) {
				String id = t1.getText();
				String sql = "select * from student where student_id=? and password=?";
                PreparedStatement st = c.c.prepareStatement(sql);

                st.setString(1, t1.getText());
                st.setString(2, t2.getText());

                ResultSet rs = st.executeQuery();				
                if(rs.next()) {
    				this.setVisible(false);
    				String number = t1.getText();
    				new SLoading(number).setVisible(true);
    			}else {
    				JOptionPane.showMessageDialog(null, "Invalid Student Login.");
    			}
			}else {
				JOptionPane.showMessageDialog(null, "Please Check the Data.");
			}
			
			}catch(Exception e) {
				
			}
		}
		
		if(ae.getSource() == b2) {
			System.exit(ABORT);
		}
	}
	
	public static void main(String[] args) {
		new Login().setVisible(true);
	}


}
