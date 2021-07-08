package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employeeGui extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtHere;
	private JTextField textField;
	private JTextField idtextField_1;
	private JTextField agetextField_1;
	private JTextField positiontextField_1;
	private JTextField numtextField_1;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeGui frame = new employeeGui();
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
	public employeeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 361);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(127, 0, 17, 322);
		contentPane.add(scrollPane);
		
		Button Employeebutton = new Button("EMPLOYEE");
		Employeebutton.setForeground(SystemColor.inactiveCaption);
		Employeebutton.setBounds(10, 10, 111, 22);
		contentPane.add(Employeebutton);
		
		Button AdsButton = new Button("ADVERTISEMENT");
		AdsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				advertisementandMarketing frame = new advertisementandMarketing();
				frame.setVisible(true);
			}
		});
		AdsButton.setForeground(SystemColor.inactiveCaption);
		AdsButton.setBounds(10, 38, 111, 22);
		contentPane.add(AdsButton);
		
		Button FinanceButton = new Button("FINANCE");
		FinanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				financeG frame = new financeG();
				frame.setVisible(true);}
		});
		FinanceButton.setForeground(SystemColor.inactiveCaption);
		FinanceButton.setBounds(10, 66, 111, 22);
		contentPane.add(FinanceButton);
		
		Button courseButton = new Button("COURSE DETAIL");
		courseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailCourse frame = new detailCourse();
				frame.setVisible(true);
			}
		});
		courseButton.setForeground(SystemColor.inactiveCaption);
		courseButton.setBounds(10, 94, 111, 22);
		contentPane.add(courseButton);
		
		JButton homePageButton = new JButton("HOME PAGE");
		homePageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to back Main menu?", "", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					mainGui frame = new mainGui();
					frame.setVisible(true);
				}
			
			}
		});
		homePageButton.setForeground(new Color(255, 215, 0));
		homePageButton.setBounds(10, 258, 111, 23);
		contentPane.add(homePageButton);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE DETAIL");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setBounds(275, 11, 198, 29);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(360, 215, 48, -77);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"NO", "NAME", " DATE BIRTH", "ID", "AGE", "POSITION"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		table_1.setBounds(160, 145, 429, 166);
		contentPane.add(table_1);
		
		JLabel nameLabel = new JLabel("NAME");
		nameLabel.setForeground(new Color(255, 215, 0));
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLabel.setBackground(SystemColor.control);
		nameLabel.setBounds(150, 46, 46, 14);
		contentPane.add(nameLabel);
		
		txtHere = new JTextField();
		txtHere.setHorizontalAlignment(SwingConstants.LEFT);
		txtHere.setForeground(new Color(65, 105, 225));
		txtHere.setBackground(SystemColor.control);
		txtHere.setBounds(230, 46, 97, 14);
		contentPane.add(txtHere);
		txtHere.setColumns(10);
		
		JLabel dateLabel_1 = new JLabel("DATE BIRTH");
		dateLabel_1.setBackground(SystemColor.control);
		dateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateLabel_1.setForeground(new Color(255, 215, 0));
		dateLabel_1.setBounds(150, 66, 75, 14);
		contentPane.add(dateLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 205));
		textField.setBounds(230, 66, 97, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel idLabel_1 = new JLabel("ID");
		idLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		idLabel_1.setForeground(new Color(255, 215, 0));
		idLabel_1.setBounds(150, 84, 46, 14);
		contentPane.add(idLabel_1);
		
		idtextField_1 = new JTextField();
		idtextField_1.setBounds(230, 84, 97, 14);
		contentPane.add(idtextField_1);
		idtextField_1.setColumns(10);
		
		JLabel ageLabel_1 = new JLabel("AGE");
		ageLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		ageLabel_1.setForeground(new Color(255, 215, 0));
		ageLabel_1.setBounds(150, 102, 34, 14);
		contentPane.add(ageLabel_1);
		
		agetextField_1 = new JTextField();
		agetextField_1.setBounds(230, 102, 97, 14);
		contentPane.add(agetextField_1);
		agetextField_1.setColumns(10);
		
		JLabel positionLabel_1 = new JLabel("POSITION");
		positionLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		positionLabel_1.setForeground(new Color(255, 215, 0));
		positionLabel_1.setBounds(150, 124, 64, 14);
		contentPane.add(positionLabel_1);
		
		positiontextField_1 = new JTextField();
		positiontextField_1.setBounds(230, 122, 97, 14);
		contentPane.add(positiontextField_1);
		positiontextField_1.setColumns(10);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
					String nameLabel = txtHere.getText();
					String  dateLabel_1 = textField.getText();
					String idLabel_1 =idtextField_1.getText();
					String ageLabel_1 = agetextField_1.getText();
					String positionLabel_1 =positiontextField_1.getText();
					String numLabel_1  = numtextField_1.getText();
					 String[] data = { numLabel_1 ,nameLabel ,dateLabel_1  ,idLabel_1,ageLabel_1,positionLabel_1 };
					 tableModel.addRow(data);
			}
		});
		addButton.setForeground(new Color(255, 215, 0));
		addButton.setBounds(424, 51, 89, 23);
		contentPane.add(addButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table_1.getSelectedRow();
		        DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
		        if (table_1.getSelectedRowCount() == 1) {
		            if (index != -1) {

		                tableModel.removeRow(index);
		                
		            }
		        }
			}
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		deleteButton.setForeground(new Color(255, 215, 0));
		deleteButton.setBounds(424, 80, 89, 23);
		contentPane.add(deleteButton);
		
		JButton printButton = new JButton("PRINT");
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found",e.getMessage());
				}}
		});
		printButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		printButton.setForeground(new Color(255, 215, 0));
		printButton.setBounds(424, 112, 89, 22);
		contentPane.add(printButton);
		
		JLabel numLabel_1 = new JLabel("NUMBER");
		numLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		numLabel_1.setForeground(new Color(255, 215, 0));
		numLabel_1.setBounds(351, 74, 46, 14);
		contentPane.add(numLabel_1);
		
		numtextField_1 = new JTextField();
		numtextField_1.setBounds(361, 96, 27, 20);
		contentPane.add(numtextField_1);
		numtextField_1.setColumns(10);
	}
}
