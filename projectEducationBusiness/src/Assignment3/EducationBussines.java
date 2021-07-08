package Assignment3;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;


import EBookWriting.mainGui;
import PROJECT.EducationDayCamps;

import javax.swing.border.MatteBorder;

public class EducationBussines extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationBussines frame = new EducationBussines();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EducationBussines() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\Education1.png"));
		setTitle("Education business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 532);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(new MatteBorder(9, 9, 9, 9, (Color) new Color(169, 169, 169)));
		panel.setBounds(0, 0, 1039, 493);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EDUCATION ");
		lblNewLabel.setBackground(new Color(245, 255, 250));
		lblNewLabel.setBounds(333, 99, 260, 109);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 38));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("EDUCATION DAY CAMPS");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\Students.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EducationDayCamps frame = new EducationDayCamps();
				frame.setVisible(true);

			}
		});
		btnNewButton.setBounds(655, 201, 366, 81);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(220, 220, 220)));
		btnNewButton.setBackground(new Color(211, 211, 211));
		panel.add(btnNewButton);
		
		JButton softwaretrainingButton = new JButton("SOFTWARE TRAINING");
		softwaretrainingButton.setForeground(new Color(0, 0, 0));
		softwaretrainingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareTraining frame = new SoftwareTraining();
				frame.setVisible(true);
			}
		});
		softwaretrainingButton.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		softwaretrainingButton.setBounds(655, 372, 366, 81);
		softwaretrainingButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		softwaretrainingButton.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(220, 220, 220)));
		softwaretrainingButton.setBackground(new Color(211, 211, 211));
		panel.add(softwaretrainingButton);
		
		JButton btnNewButton_2 = new JButton("E-BOOK WRITING");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainGui frame = new mainGui();
				frame.setVisible(true);	
			}
		});
		btnNewButton_2.setBounds(655, 39, 366, 81);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(220, 220, 220)));
		btnNewButton_2.setBackground(new Color(211, 211, 211));
		panel.add(btnNewButton_2);
		
		JLabel lblWelcomeTo = new JLabel("WELCOME TO");
		lblWelcomeTo.setForeground(Color.WHITE);
		lblWelcomeTo.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 44));
		lblWelcomeTo.setBounds(255, 26, 377, 109);
		panel.add(lblWelcomeTo);
		
		JLabel lblBussines = new JLabel("BUSINESS");
		lblBussines.setForeground(Color.WHITE);
		lblBussines.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 41));
		lblBussines.setBounds(410, 178, 220, 109);
		panel.add(lblBussines);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\edu4.jpg"));
		lblNewLabel_1.setBounds(10, 11, 635, 471);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\MARB.jpg"));
		lblNewLabel_1_1.setBounds(647, 11, 382, 471);
		panel.add(lblNewLabel_1_1);
	}
}
