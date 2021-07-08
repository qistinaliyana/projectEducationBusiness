package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class LoginPass extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField useridtextField;
	private JTextField passwordtextField;
	private JLabel passwordLabel;
	private JLabel SoftLabel;
	private JLabel userIdLabel;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JButton LoginBUTTON;
	private JLabel logLabel;
	private JLabel passLabel;
	private JLabel okLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPass frame = new LoginPass();
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
	public LoginPass() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		setTitle("Welcome to Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 0, 842, 449);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBorder(new MatteBorder(11, 11, 11, 11, (Color) new Color(47, 79, 79)));
		panel1.setBackground(new Color(95, 158, 160));
		panel1.setBounds(40, 37, 763, 102);
		panel.add(panel1);
		
		SoftLabel = new JLabel("INTELLEQ QS");
		SoftLabel.setFont(new Font("Times New Roman", Font.BOLD, 38));
		SoftLabel.setBounds(239, 11, 289, 80);
		panel1.add(SoftLabel);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new MatteBorder(11, 11, 11, 11, (Color) new Color(47, 79, 79)));
		panel2.setBackground(new Color(95, 158, 160));
		panel2.setBounds(40, 150, 763, 259);
		panel.add(panel2);
		
	    userIdLabel = new JLabel("USER ID : ");
		userIdLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		userIdLabel.setBounds(172, 30, 106, 56);
		panel2.add(userIdLabel);
		
		passwordLabel = new JLabel(" PASSWORD : ");
		passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		passwordLabel.setBounds(130, 97, 159, 56);
		panel2.add(passwordLabel);
		
		useridtextField = new JTextField();
		useridtextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		useridtextField.setSelectedTextColor(new Color(169, 169, 169));
		useridtextField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		useridtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Qistina";
				useridtextField.setText(userName);
			}
		});
		useridtextField.setBounds(286, 36, 211, 45);
		panel2.add(useridtextField);
		useridtextField.setColumns(10);
		
		passwordtextField = new JTextField();
		passwordtextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordtextField.setSelectedTextColor(new Color(211, 211, 211));
		passwordtextField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		passwordtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userPswd = "12345";
				passwordtextField.setText(userPswd);
			}
		});
		passwordtextField.setColumns(10);
		passwordtextField.setBounds(286, 97, 211, 45);
		panel2.add(passwordtextField);
		
		LoginBUTTON = new JButton("LOGIN");
		LoginBUTTON.setForeground(new Color(255, 255, 255));
		LoginBUTTON.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(47, 79, 79), new Color(47, 79, 79), new Color(47, 79, 79), new Color(47, 79, 79)));
		LoginBUTTON.setBackground(new Color(47, 79, 79));
		Image img3 = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		LoginBUTTON.setIcon(new ImageIcon(img3));
		LoginBUTTON.setBounds(316, 175, 146, 36);
		panel2.add(LoginBUTTON);
		LoginBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 try {
					
					if(useridtextField.getText().equals("Qistina") && passwordtextField.getText().equals("12345")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						Employee frame = new Employee();
						frame.setVisible(true);
						
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user id and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user id and password");
				}
			}
		});
		LoginBUTTON.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		logLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login1.png")).getImage();
		logLabel.setIcon(new ImageIcon(img));
		logLabel.setBounds(128, 30, 34, 56);
		panel2.add(logLabel);
		
		passLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/pass.png")).getImage();
		passLabel.setIcon(new ImageIcon(img1));
		passLabel.setBounds(100, 112, 34, 29);
		panel2.add(passLabel);
		
		
		
	}
}
