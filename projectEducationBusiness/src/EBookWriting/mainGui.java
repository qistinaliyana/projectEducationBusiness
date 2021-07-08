package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mainGui extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGui frame = new mainGui();
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
	public mainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 363);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(127, 0, 17, 324);
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("ABOUT US");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "\t\tCOMPANY BACKGROUND"
						+"\nThis company to held a E-book writing course"
						+"");
			}
		});
		btnNewButton.setBounds(10, 96, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton contactButton_1 = new JButton("CONTACT");
		contactButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contactButton_1.setForeground(new Color(220, 20, 60));
		contactButton_1.addActionListener( new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(contactButton_1, "CONTACT"
			+"\nWA : 0119090909"+"\nEmail : CSWriting@gmail.co.my");
			}
		});
		contactButton_1.setBounds(10, 130, 111, 23);
		contentPane.add(contactButton_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO WRITING COURSE");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 19));
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setBounds(229, 26, 299, 14);
		contentPane.add(lblNewLabel);
		
		JButton userButton_1 = new JButton("USER");
		userButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userPage frame = new userPage();
				frame.setVisible(true);
			}
		});
		userButton_1.setForeground(new Color(102, 205, 170));
		userButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));	
		userButton_1.setBounds(229, 177, 89, 23);
		contentPane.add(userButton_1);
		
		JButton adminButton_1 = new JButton("ADMIN");
		adminButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPage frame = new adminPage();
				frame.setVisible(true);
			}
		});
		adminButton_1.setForeground(new Color(50, 205, 50));
		adminButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		adminButton_1.setBounds(439, 178, 89, 23);
		contentPane.add(adminButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("please select one !!!");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(324, 121, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton exitButton_1 = new JButton("EXIT\r\n");
		exitButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		exitButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
			
		});
		exitButton_1.setForeground(new Color(34, 139, 34));
		exitButton_1.setBounds(28, 261, 73, 23);
		contentPane.add(exitButton_1);
	}

}