
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3, t4;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddStudent() {
    super("Add Student");
	setBounds(700, 200, 370, 415);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Student_id");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(34, 34, 102, 22);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(34, 68, 102, 22);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Father's Name");
	l3.setForeground(new Color(35, 35, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(34, 102, 110, 22);
	contentPane.add(l3);
	
	JLabel l8 = new JLabel("Password");
	l8.setForeground(new Color(35, 35, 112));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(34, 136, 110, 22);
	contentPane.add(l8);
	
	JLabel l7 = new JLabel("Course");
	l7.setForeground(new Color(25, 25, 112));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(34, 170, 102, 22);
	contentPane.add(l7);

	JLabel l4 = new JLabel("Branch");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(34, 204, 102, 22);
	contentPane.add(l4);

    JLabel l5 = new JLabel("Year");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(34, 238, 102, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Semester");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(34, 272, 102, 22);
	contentPane.add(l6);

	t1 = new JTextField();
	t1.setEditable(false);
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(150, 34, 156, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(150, 68, 156, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(150, 102, 156, 20);
	contentPane.add(t3);
	
	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(150, 136, 156, 20);
	contentPane.add(t4);
	
	comboBox_3 = new JComboBox();
	comboBox_3.setModel(new DefaultComboBoxModel(
	new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
	comboBox_3.setForeground(new Color(47, 79, 79));
	comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_3.setBounds(150, 170, 154, 20);
	contentPane.add(comboBox_3);


	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
	comboBox.setForeground(new Color(47, 79, 79));
	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox.setBounds(150, 204, 154, 20);
	contentPane.add(comboBox);

	comboBox_1 = new JComboBox();
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
	comboBox_1.setForeground(new Color(47, 79, 79));
	comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_1.setBounds(150, 238, 154, 20);
	contentPane.add(comboBox_1);

	comboBox_2 = new JComboBox();
	comboBox_2.setModel(
	new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_2.setForeground(new Color(47, 79, 79));
	comboBox_2.setBounds(150, 272, 154, 20);
	contentPane.add(comboBox_2);

	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(45, 310, 111, 33);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(180, 310, 111, 33);
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Student",
	TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
	panel.setBackground(new Color(211, 211, 211));
	panel.setBounds(10, 10, 330, 350);
        
   contentPane.setBackground(Color.WHITE);
   panel.setBackground(Color.WHITE);
        
	contentPane.add(panel);
	random();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                Conn con = new Conn();
                String sql = "insert into student(student_id, name, father, password, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t4.getText());
		st.setString(5, (String) comboBox_3.getSelectedItem());
		st.setString(6, (String) comboBox.getSelectedItem());
		st.setString(7, (String) comboBox_1.getSelectedItem());
		st.setString(8, (String) comboBox_2.getSelectedItem());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    random();
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                      
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
}

