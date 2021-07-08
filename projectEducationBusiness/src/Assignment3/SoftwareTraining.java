package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class SoftwareTraining extends JFrame {

	 private JPanel contentPane;
	 private JPanel panel8;
	 private JPanel panel6;
	 private JPanel panel5;
	 private JPanel panel4;
	 private JPanel panel3;
	 private JPanel panel1;
	 private JPanel panel;
	 private JFrame frame;
	 private JLabel LocationLabel;
	 private JLabel mailLabel;
	 private JLabel ContactLabel;
	 private JLabel IntelleqLabel;
	 private JLabel CplusLabel;
	 private JLabel JavaLabel;
	 private JLabel PythonLabel;
	 private JLabel StLabel;
	 private JTextPane txtpnCplus;
	 private JTextPane txtpncoreJava;
	 private JTextPane txtpnPython;
	 private JButton EXITBUTTON;
	 private JLabel img1Label;
	 private JLabel img2Label;
	 private JLabel img3Label;
	 private ImageIcon icon;
	 private JButton BackBUTTON;
	 private JButton AdminButton;
	 private JButton UserButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareTraining frame = new SoftwareTraining();
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
	public SoftwareTraining() {
		setBackground(UIManager.getColor("desktop"));
		
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1286, 665);
		icon = new ImageIcon("image/bus.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBorder(null);
		panel.setBounds(0, 0, 1273, 630);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel1.setBackground(new Color(204, 255, 204));
		panel1.setBounds(25, 260, 387, 274);
		panel.add(panel1);
		
		JavaLabel = new JLabel("JAVA");
		JavaLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		JavaLabel.setBounds(152, 11, 72, 43);
		panel1.add(JavaLabel);
		
		txtpncoreJava = new JTextPane();
		txtpncoreJava.setBackground(new Color(143, 188, 143));
		txtpncoreJava.setText("1.Core Java.\r\n2. Advanced Java.\r\n3. Web Services.\r\n4. Android Development.\r\n5. html5, eclipse, oracle, mysql.\r\n6. Java Scripts.\r\n7. Web Application development.");
		txtpncoreJava.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtpncoreJava.setBounds(40, 50, 310, 200);
		panel1.add(txtpncoreJava);
		
		panel3 = new JPanel();
		panel3.setBounds(25, 23, 1220, 86);
		panel.add(panel3);
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel3.setBackground(new Color(204, 255, 204));
		
	    StLabel = new JLabel("WELCOME TO SOFTWARE TRAINING");
		StLabel.setFont(new Font("Times New Roman", Font.BOLD, 37));
		StLabel.setBounds(261, 11, 719, 69);
		panel3.add(StLabel);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel4.setBackground(new Color(204, 255, 204));
		panel4.setBounds(439, 260, 387, 274);
		panel.add(panel4);
		
		PythonLabel = new JLabel("PYTHON");
		PythonLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		PythonLabel.setBounds(138, 11, 100, 43);
		panel4.add(PythonLabel);
		
		txtpnPython = new JTextPane();
		txtpnPython.setText("1. Fundamentals of Python.\r\n2. Working with Data.\r\n3. Python Date & Time.\r\n4. Python Advanced Topics.\r\n5. Python Object & Class.\r\n6. Python Files.\r\n7. Python Datatypes.");
		txtpnPython.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtpnPython.setBackground(new Color(143, 188, 143));
		txtpnPython.setBounds(42, 47, 310, 200);
		panel4.add(txtpnPython);
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel5.setBackground(new Color(204, 255, 204));
		panel5.setBounds(857, 260, 387, 274);
		panel.add(panel5);
		
	    CplusLabel = new JLabel("C++");
		CplusLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		CplusLabel.setBounds(157, 11, 54, 43);
		panel5.add(CplusLabel);
		
	    txtpnCplus = new JTextPane();
		txtpnCplus.setText("1. Introduction to C++.\r\n2. Data Types and Variables.\r\n3. Input/Output Management. \r\n4. Control-Flow Statements.\r\n5. Control-Flow Statements.\r\n6. Arrays, Pointers, and Strings. \r\n7. Structures.");
		txtpnCplus.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtpnCplus.setBackground(new Color(143, 188, 143));
		txtpnCplus.setBounds(38, 52, 310, 200);
		panel5.add(txtpnCplus);
		
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel6.setBackground(new Color(204, 255, 204));
		panel6.setBounds(25, 120, 1220, 64);
		panel.add(panel6);
		
		IntelleqLabel = new JLabel("INTELLEQ QS");
		IntelleqLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		IntelleqLabel.setBounds(90, 11, 190, 45);
		panel6.add(IntelleqLabel);
		
		ContactLabel = new JLabel("Contact us : 783478249");
		ContactLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		ContactLabel.setBounds(468, 11, 327, 45);
		panel6.add(ContactLabel);
		
	    mailLabel = new JLabel("IntellectQS@gmail.com");
		mailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		mailLabel.setBounds(895, 11, 269, 45);
		panel6.add(mailLabel);
		
		img1Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Phone.png")).getImage();
		img1Label.setIcon(new ImageIcon(img));
		img1Label.setBounds(427, 11, 53, 42);
		panel6.add(img1Label);
		
		img2Label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/email.png")).getImage();
		img2Label.setIcon(new ImageIcon(img1));
		img2Label.setBounds(857, 11, 42, 45);
		panel6.add(img2Label);
		
		img3Label = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/bus.png")).getImage();
		img3Label.setIcon(new ImageIcon(img3));
		img3Label.setBounds(54, 11, 53, 45);
		panel6.add(img3Label);
		
	    panel8 = new JPanel();
		panel8.setBounds(25, 190, 1220, 59);
		panel.add(panel8);
		panel8.setLayout(null);
		panel8.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(85, 107, 47)));
		panel8.setBackground(new Color(204, 255, 204));
		
	    LocationLabel = new JLabel("G-85, 1-85, 2, 85, Jalan Prima SG 3, Prima Seri Gombak, 68100 Batu Caves, Selangor.");
	    Image img6 = new ImageIcon(this.getClass().getResource("/Location1.png")).getImage();
	    LocationLabel.setIcon(new ImageIcon(img6));
		LocationLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		LocationLabel.setBounds(272, 11, 726, 37);
		panel8.add(LocationLabel);
		
		EXITBUTTON = new JButton("EXIT");
		EXITBUTTON.setBounds(1123, 555, 122, 47);
		panel.add(EXITBUTTON);
		EXITBUTTON.setForeground(new Color(0, 0, 0));
		EXITBUTTON.setBackground(new Color(240, 255, 240));
		EXITBUTTON.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(85, 107, 47), new Color(85, 107, 47), new Color(85, 107, 47), new Color(85, 107, 47)));
		EXITBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Software Training", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}

			}
		});
		EXITBUTTON.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		
		AdminButton = new JButton("ADMIN");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPass frame = new LoginPass();
				frame.setVisible(true);
			}
		});
		AdminButton.setForeground(new Color(0, 0, 0));
		AdminButton.setBackground(new Color(240, 255, 240));
		AdminButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		AdminButton.setBounds(354, 557, 159, 44);
		panel.add(AdminButton);
		
		UserButton = new JButton("USER");
		UserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Advertisement frame = new Advertisement();
				//frame.setVisible(true);
				Sales frame3 = new Sales();
				frame3.setVisible(true);
				Customer frame1= new Customer();
				frame1.setVisible(true);
			}
		});
		UserButton.setBackground(new Color(240, 255, 240));
		UserButton.setForeground(new Color(0, 0, 0));
		UserButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		UserButton.setBounds(767, 557, 159, 44);
		panel.add(UserButton);
		
		BackBUTTON = new JButton("BACK");
		BackBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EducationBussines frame = new EducationBussines();
				frame.setVisible(true);
			}
		});
		BackBUTTON.setForeground(Color.BLACK);
		BackBUTTON.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		BackBUTTON.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(85, 107, 47), new Color(85, 107, 47), new Color(85, 107, 47), new Color(85, 107, 47)));
		BackBUTTON.setBackground(new Color(240, 255, 240));
		BackBUTTON.setBounds(25, 555, 122, 47);
		panel.add(BackBUTTON);
	}
}
