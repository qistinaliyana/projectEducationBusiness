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

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel titleLabel;
	private JLabel adsLabel;
	private JLabel adsLabel1;
	private JLabel adsLabel2;
	private JLabel adsLabel4;
	private JLabel StLabel;
	private JLabel SeatLabel;
	private JLabel whyLabel1;
	private JLabel whyLabel;
	private JLabel WhyLabel2;
	private JScrollPane scrollPane;
	private JTextPane txtpnClassCourseDuration;
	private JTextPane txtpntestimonystudents;
	private JButton exitButton;
	private JMenuBar menuBar;
	private JMenu mnNewMenuAboutUs;
	private JMenuItem SoftwaretrainingMenuItem;
	private JMenuItem EmployeeMenuItem;
	private JMenu mnNewMenuFinance;
	private JMenuItem FinanceMenuItem;
	private JMenuItem SalesMenuItem;
	private JMenu mnNewMenuSR;
	private JMenuItem AdsMenuItem;
	
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 673);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 255, 240));
		setJMenuBar(menuBar);
		
		mnNewMenuAboutUs = new JMenu("About Us");
		menuBar.add(mnNewMenuAboutUs);
		
		SoftwaretrainingMenuItem = new JMenuItem("Intelleq QS");
		SoftwaretrainingMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareTraining frame = new SoftwareTraining();
				frame.setVisible(true);
			}
		});
		mnNewMenuAboutUs.add(SoftwaretrainingMenuItem);
		
		EmployeeMenuItem = new JMenuItem("Employee");
		EmployeeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		mnNewMenuAboutUs.add(EmployeeMenuItem);
		
		mnNewMenuFinance = new JMenu("Finance");
		menuBar.add(mnNewMenuFinance);
		
		FinanceMenuItem = new JMenuItem("Finance");
		FinanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
			}
		});
		mnNewMenuFinance.add(FinanceMenuItem);
		
	    SalesMenuItem = new JMenuItem("Sales");
		SalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales frame = new Sales();
				frame.setVisible(true);
			}
		});
		mnNewMenuFinance.add(SalesMenuItem);
		
	    mnNewMenuSR = new JMenu("Student reviews");
		menuBar.add(mnNewMenuSR);
		
		AdsMenuItem = new JMenuItem("Advertisement");
		mnNewMenuSR.add(AdsMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(0, 139, 139));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 0, 1113, 614);
		contentPane.add(panel);
		panel.setLayout(null);
		
	    panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setForeground(Color.BLACK);
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(47, 79, 79)));
		panel1.setBackground(new Color(47, 79, 79));
		panel1.setBounds(56, 21, 1001, 57);
		panel.add(panel1);
		
		titleLabel = new JLabel("ADVERTISEMENT");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		titleLabel.setBounds(334, 0, 342, 57);
		panel1.add(titleLabel);
		
	    panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setForeground(Color.BLACK);
		panel2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(47, 79, 79)));
		panel2.setBackground(new Color(240, 255, 255));
		panel2.setBounds(56, 525, 127, 66);
		panel.add(panel2);
		
		exitButton = new JButton("EXIT");
		exitButton.setForeground(new Color(255, 255, 255));
		exitButton.setBackground(new Color(95, 158, 160));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Advertisement  System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		exitButton.setBounds(10, 11, 107, 43);
		panel2.add(exitButton);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setForeground(Color.BLACK);
		panel3.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(47, 79, 79)));
		panel3.setBackground(new Color(240, 255, 255));
		panel3.setBounds(56, 86, 1001, 187);
		panel.add(panel3);
		
		adsLabel = new JLabel("Best Training Centers in Gombak,");
		Image img1 = new ImageIcon(this.getClass().getResource("/location1.png")).getImage();
		adsLabel.setIcon(new ImageIcon(img1));
		adsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		adsLabel.setBounds(346, 11, 314, 42);
		panel3.add(adsLabel);
		
		adsLabel1 = new JLabel("Those candidates who wish to enroll and attend the Training programe,");
		adsLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		adsLabel1.setBounds(210, 50, 595, 42);
		panel3.add(adsLabel1);
		
	    adsLabel2 = new JLabel("Please Communicate with us Call 7676765421 , 080-42108236 , 080-42024661 and Book your Seat Now!");
		adsLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		adsLabel2.setBounds(45, 84, 914, 42);
		panel3.add(adsLabel2);
		
	    adsLabel4 = new JLabel("We Provide PYTHON, JAVA, C/C++ Certification Training Courses with Placement Support till you get Job !");
		adsLabel4.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		adsLabel4.setBounds(45, 122, 935, 42);
		panel3.add(adsLabel4);
		
		panel4 = new JPanel();
		panel4.setBounds(56, 284, 1001, 230);
		panel.add(panel4);
		panel4.setLayout(null);
		panel4.setForeground(Color.BLACK);
		panel4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(47, 79, 79)));
		panel4.setBackground(new Color(95, 158, 160));
		
		StLabel = new JLabel("SOFTWARE TRAINING COURSE");
		StLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		StLabel.setBounds(61, 11, 329, 44);
		panel4.add(StLabel);
		
		SeatLabel = new JLabel("Book your Seat Now!");
		SeatLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		SeatLabel.setBounds(125, 177, 198, 49);
		panel4.add(SeatLabel);
		
		txtpnClassCourseDuration = new JTextPane();
		txtpnClassCourseDuration.setBackground(new Color(240, 255, 255));
		txtpnClassCourseDuration.setText("CLASS       COURSE DURATION      PRICE\r\nJAVA                3 MONTH                RM 800\r\nPYTHON          2 MONTH                RM 700\r\nC++                   4 MONTH                RM 900");
		txtpnClassCourseDuration.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnClassCourseDuration.setBounds(34, 58, 386, 108);
		panel4.add(txtpnClassCourseDuration);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		scrollPane.setBounds(487, 11, 504, 208);
		panel4.add(scrollPane);
		
		txtpntestimonystudents = new JTextPane();
		txtpntestimonystudents.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtpntestimonystudents.setBackground(new Color(240, 255, 255));
		txtpntestimonystudents.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpntestimonystudents.setText("Student Testimonials: \r\n\r\nCourse: Python\r\nSaurabh says: Intelleq QS provided me good knowledge of technology. It's an excellent place to enhance your skills.\r\n\r\nCourse: Java\r\nAditi says: The institute has a very friendly atmosphere. The instructors are helpful, and they groomed me well for my interview.\r\n\r\nCourse: C++\r\nMayur says: It was a great experience of getting trained at Intelleq QS. The coordination between students & faculties is really good.\r\n\r\nCourse: Java\r\nSaiful says: Good teaching methods. Skilled staff at Intelleq QS made it a great learning experience. Thank you Intelleq QS!\r\n\r\nCourse: Java\r\nAnisa says: It was a good experience. I got to learn about new technologies. The lecturers were helpful and the placement cell was very effective.\r\n\r\nCourse: Python\r\nMohammad says: Highly skilled & knowledgeable teaching staff. Good infrastructure & excellent placement staff.");
		scrollPane.setViewportView(txtpntestimonystudents);
		
		whyLabel1 = new JLabel("We believe everyone should have the opportunity to create progress through technology and develop the skills of tomorrow. ");
		whyLabel1.setForeground(new Color(255, 255, 255));
		whyLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		whyLabel1.setBounds(308, 545, 719, 32);
		panel.add(whyLabel1);
		
		whyLabel = new JLabel("Why Intelleq QS?");
		whyLabel.setForeground(new Color(255, 255, 255));
		whyLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		whyLabel.setBounds(590, 521, 94, 27);
		panel.add(whyLabel);
		
	    WhyLabel2 = new JLabel("With assessments, learning paths and courses authored by industry experts.\r\n");
	    WhyLabel2.setForeground(new Color(255, 255, 255));
		WhyLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		WhyLabel2.setBounds(438, 571, 430, 32);
		panel.add(WhyLabel2);
		
	}
}
