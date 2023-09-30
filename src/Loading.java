import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel panel1;
	private JProgressBar p1;
	int s;
	Thread th;

	public Loading() {

		th = new Thread((Runnable) this);
        setBounds(500, 300, 600, 400);
		setLayout(null);

		JLabel l1 = new JLabel("Welcome to Smart Library");
		l1.setForeground(new Color(72, 209, 204));
		l1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		l1.setBounds(80, 46, 500, 40);
		add(l1);

		p1 = new JProgressBar();
		p1.setFont(new Font("Tahoma", Font.BOLD, 12));
		p1.setStringPainted(true);
		p1.setBounds(150, 135, 300, 25);
		add(p1);

		JLabel l2 = new JLabel("Please Wait....");
		l2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		l2.setForeground(new Color(160, 82, 45));
		l2.setBounds(250, 165, 150, 20);
		add(l2);


		setUploading();
	}

	public static void main(String[] args) {
		new Loading().setVisible(true);
	}

	public void setUploading() {
		th.start();
	}

	public void run() {
		try {
			for (int i = 0; i < 200; i++) {
				s = s + 1;
				int m = p1.getMaximum();
				int v = p1.getValue();
				if (v < m) {
					p1.setValue(p1.getValue() + 1);
				} else {
					i = 201;
					setVisible(false);
				    new Home().setVisible(true);
				}
				Thread.sleep(50);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
