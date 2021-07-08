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

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class Customer extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldNAME;
	private JTextField textFieldNO;
	private JTextField textFieldEMAIL;
	private JTextField textFieldtotalpay;
	private JTextField textField;
	private JComboBox ModecomboBox;
	private JTable table;
	private JCheckBox CASHCheckBox;
	private JCheckBox CARDCheckBox;
	private JRadioButton javaRadioButton;
	private JRadioButton pythonRadioButton;
	private JRadioButton cplusRadioButton;
	private JButton PaymentButton;
	private JButton DeleteButton;
	private JButton UPDATEButton;
	private JButton EnterButton;
	private JButton RESETButton;
	private JButton EXITButton;
	private JButton Printbutton;
	private String paymentMethod = " ";
	private double total = 0;
	private JLabel lblThankYouFor;
	private JLabel CustomerLabel;
	private JLabel CUSLabel;
	private JLabel NameLabel;
	private JLabel NoHpLabel;
	private JLabel EmailLabel;
	private JLabel ModeLabel;
	private JLabel CourseLabel;
	private JLabel PaymentLabel;
	private JScrollPane scrollPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JMenuBar menuBar;
	private JMenu mnNewMenuaboutUs;
	private JMenuItem IntelleqMenuItem;
	private JMenu mnNewMenuStudents;
	private JMenuItem AdsMenuItem;
	private JLabel cashimgLabel;
	private JLabel cardimgLabel;
	private String pricePython;
	private String priceJava;
	private String priceCplusplus;
	 private String s,s6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Customer() {}
	
   public Customer(String jp, String pp, String pc) { //constructor with arguments to pass the values
		this.priceJava= jp; //
		this.pricePython= pp;
		this.priceCplusplus = pc;
		
		setBackground(UIManager.getColor("desktop"));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));	
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1286, 665);
		
		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.setBackground(new Color(255, 240, 245));
		setJMenuBar(menuBar);
		
		mnNewMenuaboutUs = new JMenu("About Us");
		menuBar.add(mnNewMenuaboutUs);
		
		IntelleqMenuItem = new JMenuItem("Intelleq QS");
		IntelleqMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareTraining frame = new SoftwareTraining();
				frame.setVisible(true);
			}
		});
		mnNewMenuaboutUs.add(IntelleqMenuItem);
		
		mnNewMenuStudents = new JMenu("Students reviews");
		menuBar.add(mnNewMenuStudents);
		
		AdsMenuItem = new JMenuItem("Advertisement");
		AdsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
			}
		});
		mnNewMenuStudents.add(AdsMenuItem);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(new Color(221, 160, 221));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBorder(null);
		panel.setBounds(0, 0, 1273, 616);
		contentPane.add(panel);
		panel.setLayout(null);
				
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setForeground(new Color(221, 160, 221));
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(230, 230, 250)));
		panel1.setBackground(new Color(95, 158, 160));
		panel1.setBounds(470, 24, 782, 567);
		panel.add(panel1);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 0, 128), new Color(128, 0, 128), new Color(128, 0, 128), new Color(128, 0, 128)));
		scrollPane.setBounds(10, 65, 762, 337);
		panel1.add(scrollPane);
		
		table = new JTable();
		table.setSelectionBackground(new Color(128, 0, 128));
		table.setSelectionForeground(new Color(255, 255, 255));
		table.setGridColor(new Color(216, 191, 216));
		table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(218, 112, 214), new Color(218, 112, 214), new Color(218, 112, 214), new Color(218, 112, 214)));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"NAME", "NO. HP", "EMAIL", "MODE", "COURSE", "PRICE (RM)", "PAYMENT (RM)"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(17);
		scrollPane.setViewportView(table);
		
		PaymentButton = new JButton("PAYMENT");
		PaymentButton.setBounds(145, 413, 144, 47);
		panel1.add(PaymentButton);
		PaymentButton.setBackground(new Color(211, 211, 211));
		PaymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CASHCheckBox.isSelected()) {
					paymentMethod = "Cash";
					
				} else {
					paymentMethod = "Card";
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String r = String.valueOf(model.getValueAt(i, 6));
			        
			        total += Double.parseDouble(r);
			        
			    }
			    
			    textField = new JTextField();
				textField.setBounds(308, 418, 192, 38);
				panel1.add(textField);
				textField.setBackground(Color.white);
				textField.setEditable(false);
				textField.setFont(new Font("Times New Roman", Font.PLAIN, 21));
				textField.setColumns(10);
				String result=String.valueOf(total);
				textField.setText(result);
				
				JOptionPane.showConfirmDialog(frame, "Registration Successful", "Customer System", JOptionPane.CANCEL_OPTION);
			
			}
			
		});
	    	PaymentButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
			String result=String.valueOf(total);  
		
			CustomerLabel = new JLabel("CUSTOMER REGISTRATION");
			Image img1 = new ImageIcon(this.getClass().getResource("/customer.png")).getImage();
			CustomerLabel.setIcon(new ImageIcon(img1));
			CustomerLabel.setBounds(223, 11, 354, 46);
			panel1.add(CustomerLabel);
			CustomerLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
			
			DeleteButton = new JButton("DELETE");
			DeleteButton.setBackground(new Color(211, 211, 211));
			DeleteButton.setBounds(406, 495, 144, 47);
			panel1.add(DeleteButton);
			DeleteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if(table.getSelectedRow()==-1) {
						if(table.getRowCount()==0) {
							JOptionPane.showMessageDialog(null,"No data to delete",
									"Customer System", JOptionPane.OK_OPTION);
						}else {
							JOptionPane.showMessageDialog(null,"Select a row to delete",
									"Customer System", JOptionPane.OK_OPTION);
						}
					}else {
						model.removeRow(table.getSelectedRow());
					}
				}
			});
			DeleteButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
			
		    UPDATEButton = new JButton("UPDATE");
		    UPDATEButton.setBackground(new Color(211, 211, 211));
			UPDATEButton.setBounds(38, 496, 144, 47);
			panel1.add(UPDATEButton);
			UPDATEButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					File file = new File ("C:\\Users\\HP\\git\\Assignment3\\Assignment 3\\src\\Assignment3\\customer.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			}
				);
			UPDATEButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			
			panel5 = new JPanel();
			panel5.setBounds(597, 482, 156, 60);
			panel1.add(panel5);
			panel5.setLayout(null);
			panel5.setForeground(new Color(221, 160, 221));
			panel5.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(230, 230, 250)));
			panel5.setBackground(new Color(216, 191, 216));
			
			EXITButton = new JButton("EXIT");
			EXITButton.setBackground(new Color(211, 211, 211));
			EXITButton.setBounds(10, 11, 136, 40);
			panel5.add(EXITButton);
			EXITButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame = new JFrame();
					if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration System", 
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				}
			});
			EXITButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
			
			Printbutton = new JButton("PRINT");
			Printbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					if(i>=0) {
						model.setValueAt(textFieldNAME.getText(),i,0);
				    	model.setValueAt(textFieldNO.getText(),i,1);
				    	model.setValueAt(textFieldEMAIL.getText(),i,2);
				    	model.setValueAt(ModecomboBox.getSelectedItem(),i,3);
				 
				    	
						JOptionPane.showMessageDialog(null, "Print Successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please select a row first!");
					}
				}
			});
			Printbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			Printbutton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			Printbutton.setBackground(new Color(211, 211, 211));
			Printbutton.setBounds(223, 496, 144, 47);
			panel1.add(Printbutton);
			
	    panel2 = new JPanel();
		panel2.setBounds(21, 24, 439, 84);
		panel.add(panel2);
		panel2.setLayout(null);
		panel2.setForeground(new Color(221, 160, 221));
		panel2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(230, 230, 250)));
		panel2.setBackground(new Color(95, 158, 160));
		
		CUSLabel = new JLabel("INTELLEQ QS");
		CUSLabel.setForeground(new Color(255, 255, 255));
		CUSLabel.setBackground(new Color(95, 158, 160));
		CUSLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		CUSLabel.setBounds(87, 11, 288, 64);
		panel2.add(CUSLabel);
		
		panel3 = new JPanel();
		panel3.setBounds(21, 117, 439, 402);
		panel.add(panel3);
		panel3.setLayout(null);
		panel3.setForeground(new Color(221, 160, 221));
		panel3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(230, 230, 250)));
		panel3.setBackground(new Color(95, 158, 160));
		
		NameLabel = new JLabel("Name :");
		NameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		NameLabel.setBounds(24, 11, 131, 64);
		panel3.add(NameLabel);
		
		NoHpLabel = new JLabel("No. Hp :");
		NoHpLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		NoHpLabel.setBounds(24, 56, 131, 64);
		panel3.add(NoHpLabel);
		
		EmailLabel = new JLabel("Email :");
		EmailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		EmailLabel.setBounds(24, 103, 131, 64);
		panel3.add(EmailLabel);
		
		ModeLabel = new JLabel("Mode :");
		ModeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		ModeLabel.setBounds(24, 150, 131, 64);
		panel3.add(ModeLabel);
		
		CourseLabel = new JLabel("Course : ");
		CourseLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		CourseLabel.setBounds(24, 205, 93, 64);
		panel3.add(CourseLabel);
		
		textFieldNAME = new JTextField();
		textFieldNAME.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldNAME.setBounds(151, 26, 246, 36);
		panel3.add(textFieldNAME);
		textFieldNAME.setColumns(10);
		
		textFieldNO = new JTextField();
		textFieldNO.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldNO.setColumns(10);
		textFieldNO.setBounds(151, 71, 246, 36);
		panel3.add(textFieldNO);
		
		textFieldEMAIL = new JTextField();
		textFieldEMAIL.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldEMAIL.setColumns(10);
		textFieldEMAIL.setBounds(151, 118, 246, 36);
		panel3.add(textFieldEMAIL);
		
	    ModecomboBox = new JComboBox();
		ModecomboBox.setForeground(new Color(0, 0, 0));
		ModecomboBox.setToolTipText("");
		ModecomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		ModecomboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Mode", "Classroom", "Online"}));
		ModecomboBox.setBounds(151, 164, 246, 36);
		panel3.add(ModecomboBox);
		
		PaymentLabel = new JLabel("Payment Methods : ");
		PaymentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		PaymentLabel.setBounds(24, 260, 167, 64);
		panel3.add(PaymentLabel);
		
		CASHCheckBox = new JCheckBox("Cash");
		buttonGroup_1.add(CASHCheckBox);
		CASHCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		CASHCheckBox.setBounds(206, 281, 76, 23);
		panel3.add(CASHCheckBox);
		
		CARDCheckBox = new JCheckBox("Card");
		buttonGroup_1.add(CARDCheckBox);
		CARDCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		CARDCheckBox.setBounds(321, 281, 76, 23);
		panel3.add(CARDCheckBox);
		
		javaRadioButton = new JRadioButton("Java");
		buttonGroup.add(javaRadioButton);
		javaRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		javaRadioButton.setBounds(144, 221, 76, 33);
		panel3.add(javaRadioButton);
		
		pythonRadioButton = new JRadioButton("Python");
		buttonGroup.add(pythonRadioButton);
		pythonRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		pythonRadioButton.setBounds(232, 221, 93, 33);
		panel3.add(pythonRadioButton);
		
		cplusRadioButton = new JRadioButton("C++");
		buttonGroup.add(cplusRadioButton);
		cplusRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		cplusRadioButton.setBounds(337, 221, 76, 33);
		panel3.add(cplusRadioButton);
		
		EnterButton = new JButton("ENTER");
		EnterButton.setBackground(new Color(211, 211, 211));
		EnterButton.setBounds(10, 345, 139, 46);
		panel3.add(EnterButton);
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String priceC = " ";
				String price = "";
				double priceJava = Double.parseDouble(jp);
				double pricePython= Double.parseDouble(pp);
				double priceCplusplus = Double.parseDouble(pc);
				
								
				if (javaRadioButton.isSelected()) {
					price = javaRadioButton.getText();
					priceC = Double. toString(priceJava); 
					
				} else if (pythonRadioButton.isSelected()){
					price = pythonRadioButton.getText();
					priceC = Double. toString(pricePython);
					
				} else {
					price = cplusRadioButton.getText();
					priceC = Double. toString(priceCplusplus);					
				}
				
				double totalPrice = Double.parseDouble(priceC);
				String totalPriceStr = Double. toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldNAME.getText(),
						textFieldNO.getText(),
						textFieldEMAIL.getText(),
						ModecomboBox.getSelectedItem(),
						price,
						priceC,
						totalPriceStr,
						
						
                 });
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Customer System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
	    );
		EnterButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		RESETButton = new JButton("RESET");
		RESETButton.setBackground(new Color(211, 211, 211));
		RESETButton.setBounds(290, 345, 139, 46);
		panel3.add(RESETButton);
		RESETButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNAME.setText("");
				textFieldNO.setText("");
				textFieldEMAIL.setText("");
				textFieldtotalpay.setText("");
				
			}
		});
		RESETButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		cashimgLabel = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/cash.png")).getImage();
		cashimgLabel.setIcon(new ImageIcon(img5));
		cashimgLabel.setBounds(188, 281, 32, 23);
		panel3.add(cashimgLabel);
		
		cardimgLabel = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/card.png")).getImage();
	    cardimgLabel.setIcon(new ImageIcon(img2));
		cardimgLabel.setBounds(303, 281, 27, 23);
		panel3.add(cardimgLabel);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setForeground(new Color(230, 230, 250));
		panel4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(230, 230, 250)));
		panel4.setBackground(new Color(95, 158, 160));
		panel4.setBounds(21, 530, 439, 61);
		panel.add(panel4);
		
		lblThankYouFor = new JLabel("Thank you for your registration!");
		lblThankYouFor.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblThankYouFor.setBounds(69, 11, 318, 35);
		panel4.add(lblThankYouFor);
	
	}
}
