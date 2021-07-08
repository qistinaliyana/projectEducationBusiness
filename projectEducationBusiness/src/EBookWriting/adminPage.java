package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class adminPage extends JFrame {

	private JPanel contentPane;
	private JTextField usernameFill;
	private JTextField passFilling;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminPage frame = new adminPage();
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
	public adminPage() {
		setBackground(SystemColor.controlHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 381);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeAdmin = new JLabel("WELCOME ADMIN");
		welcomeAdmin.setForeground(new Color(240, 230, 140));
		welcomeAdmin.setFont(new Font("Ebrima", Font.BOLD, 23));
		welcomeAdmin.setBounds(191, 12, 204, 57);
		contentPane.add(welcomeAdmin);
		
		JLabel userNameLabel = new JLabel("USERNAME :");
		userNameLabel.setForeground(new Color(255, 215, 0));
		userNameLabel.setBounds(170, 119, 97, 16);
		contentPane.add(userNameLabel);
		
		JLabel passwordLabel = new JLabel("PASSWORD  :");
		passwordLabel.setForeground(new Color(255, 215, 0));
		passwordLabel.setBounds(161, 147, 85, 16);
		contentPane.add(passwordLabel);
		
		JButton logInButton = new JButton("Log in");
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (usernameFill.getText().equals("Vicky") && passFilling.getText().equals("Vicky12345")) 
				JOptionPane.showMessageDialog(null, "Login Successfully");
			employeeGui frame = new employeeGui();
			frame.setVisible(true);
				
			}
			
		});
		logInButton.setBackground(new Color(112, 128, 144));
		logInButton.setForeground(new Color(255, 215, 0));
		logInButton.setBounds(251, 188, 74, 26);
		contentPane.add(logInButton);
		
		usernameFill = new JTextField();
		usernameFill.setForeground(new Color(169, 169, 169));
		usernameFill.setText("   ****fillin here****");
		usernameFill.setBounds(251, 117, 114, 20);
		contentPane.add(usernameFill);
		usernameFill.setColumns(10);
		
		passFilling = new JTextField();
		passFilling.setForeground(new Color(169, 169, 169));
		passFilling.setText("  ****filling here****");
		passFilling.setBounds(251, 145, 114, 20);
		contentPane.add(passFilling);
		passFilling.setColumns(10);
	}
}