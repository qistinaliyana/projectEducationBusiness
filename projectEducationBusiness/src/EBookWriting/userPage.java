package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class userPage extends JFrame {
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textFill;
	private JTextField txtWwddyy;
	private JTextField txtFillHere;
	private JTable table;
	private JTextField datetextField;
	private JTextField textFieldTot;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userPage frame = new userPage();
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
	public userPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 361);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeUser = new JLabel("WELCOME USER");
		welcomeUser.setForeground(new Color(240, 230, 140));
		welcomeUser.setFont(new Font("Ebrima", Font.BOLD, 23));
		welcomeUser.setBounds(315, 11, 185, 31);
		contentPane.add(welcomeUser);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(10, 75, 56, 14);
		contentPane.add(nameLabel);
		
		textFill = new JTextField();
		textFill.setForeground(new Color(169, 169, 169));
		textFill.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFill.setBounds(91, 71, 93, 18);
		contentPane.add(textFill);
		textFill.setColumns(10);
		
		JLabel dateLabel = new JLabel("Date of birth");
		dateLabel.setBounds(10, 100, 93, 14);
		contentPane.add(dateLabel);
		
		txtWwddyy = new JTextField();
		txtWwddyy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtWwddyy.setForeground(SystemColor.activeCaptionBorder);
		txtWwddyy.setBounds(91, 96, 93, 18);
		contentPane.add(txtWwddyy);
		txtWwddyy.setColumns(10);
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(10, 125, 46, 20);
		contentPane.add(ageLabel);
		
		txtFillHere = new JTextField();
		txtFillHere.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFillHere.setForeground(SystemColor.activeCaptionBorder);
		txtFillHere.setBounds(91, 125, 93, 20);
		contentPane.add(txtFillHere);
		txtFillHere.setColumns(10);
		
		JButton submitButton = new JButton("ADD");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
					String  nameLabel =textFill.getText();
					String dateLabel = txtWwddyy.getText();
					String ageLabel = txtFillHere.getText();
					String dateIblNewLabel = datetextField.getText();
					String durationlblNewLabel = textField.getText();
					String learnlblNewLabel = textField_1.getText();
					 String[] data = {nameLabel,dateLabel  ,ageLabel, dateIblNewLabel,durationlblNewLabel,learnlblNewLabel};
					 tableModel.addRow(data);
			}
			});
		submitButton.setFont(new Font("Dialog", Font.BOLD, 11));
		submitButton.setForeground(new Color(255, 215, 0));
		submitButton.setBackground(SystemColor.inactiveCaptionText);
		submitButton.setBounds(6, 256, 80, 26);
		contentPane.add(submitButton);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(187, 0, 18, 322);
		contentPane.add(scrollPane);
		
		JButton DeletebtnNewButton = new JButton("DELETE");
		DeletebtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
		        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		        if (table.getSelectedRowCount() == 1) {
		            if (index != -1) {

		                tableModel.removeRow(index);
		                
		            }
		        }
			}
		});
		DeletebtnNewButton.setBackground(SystemColor.inactiveCaptionText);
		DeletebtnNewButton.setForeground(new Color(255, 215, 0));
		DeletebtnNewButton.setFont(new Font("Dialog", Font.BOLD, 11));
		DeletebtnNewButton.setBounds(104, 256, 80, 26);
		contentPane.add(DeletebtnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NAME", "DATE OF BIRTH", "AGE", "DATE", "DURATION", "COURSE"},
				
			},
			new String[] {
				"NAME", "DATEOFBIRTH", "AGE", "DATE", "DURATION", "COURSE"
			}
		));
		table.setBounds(211, 75, 413, 160);
		contentPane.add(table);
		
		JLabel dateIblNewLabel = new JLabel("DATE");
		dateIblNewLabel.setForeground(new Color(255, 215, 0));
		dateIblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateIblNewLabel.setBounds(10, 159, 46, 14);
		contentPane.add(dateIblNewLabel);
		
		datetextField = new JTextField();
		datetextField.setBounds(66, 156, 56, 20);
		contentPane.add(datetextField);
		datetextField.setColumns(10);
		
		JLabel durationlblNewLabel = new JLabel("DURATION");
		durationlblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		durationlblNewLabel.setForeground(new Color(255, 215, 0));
		durationlblNewLabel.setBounds(10, 186, 63, 14);
		contentPane.add(durationlblNewLabel);
		
		JLabel learnlblNewLabel = new JLabel("COURSE");
		learnlblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		learnlblNewLabel.setForeground(new Color(255, 215, 0));
		learnlblNewLabel.setBounds(109, 187, 46, 14);
		contentPane.add(learnlblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(305, 258, 85, 22);
		contentPane.add(textArea);
		
		JButton bookbtnNewButton = new JButton("BOOK");
		bookbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Your booking is succesfull \n \tYou want to back main menu?", "SUCCESFULL", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					mainGui frame = new mainGui();
					frame.setVisible(true);
				}
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found",e.getMessage());
				}
			}
		});
		bookbtnNewButton.setForeground(new Color(34, 139, 34));
		bookbtnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		bookbtnNewButton.setBounds(474, 291, 89, 23);
		contentPane.add(bookbtnNewButton);
		
		JButton btnNewButton = new JButton("AMOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		btnNewButton.setBounds(211, 259, 84, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(0, 207, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 207, 86, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 215, 0));
		btnNewButton_1.setBounds(53, 293, 89, 23);
		contentPane.add(btnNewButton_1);
	
}
}