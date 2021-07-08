package EBookWriting;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class advertisementandMarketing extends JFrame  {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private final JTable tableAds = new JTable();
	private JTextField dateStartField;
	private JTextField dateEndField;
	private JTextField textAddAdsField;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					advertisementandMarketing frame = new advertisementandMarketing();
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
	public advertisementandMarketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 361);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel adsLabel = new JLabel("ADVERTISEMENT");
		adsLabel.setForeground(new Color(240, 230, 140));
		adsLabel.setFont(new Font("Ebrima", Font.BOLD, 23));
		adsLabel.setBounds(273, 11, 201, 31);
		contentPane.add(adsLabel);
		
		Button financeButton = new Button("FINANCE");
		financeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				financeG frame = new financeG();
				frame.setVisible(true);}
		});
		financeButton.setBounds(7, 46, 113, 22);
		contentPane.add(financeButton);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setForeground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(126, 0, 17, 322);
		contentPane.add(scrollPane);
		
		Button courseButton = new Button("COURSE DETAIL");
		courseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					detailCourse frame = new detailCourse();
					frame.setVisible(true);
				}
			
		});
		courseButton.setBounds(8, 74, 112, 22);
		contentPane.add(courseButton);
		
		JButton homeNewButton = new JButton("HOME PAGE");
		homeNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to back Main menu?", "", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					mainGui frame = new mainGui();
					frame.setVisible(true);
			}
			}
		});
		homeNewButton.setBackground(SystemColor.activeCaptionBorder);
		homeNewButton.setForeground(new Color(255, 215, 0));
		homeNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		homeNewButton.setBounds(7, 274, 103, 23);
		contentPane.add(homeNewButton);
		
		
		tableAds.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(240, 240, 240), new Color(255, 255, 255), new Color(105, 105, 105), new Color(160, 160, 160)), new LineBorder(new Color(180, 180, 180))));
		tableAds.setModel(new DefaultTableModel(
			new Object[][] {
				{"ADDEVERTISEMENT", "DATE START", "DATE END"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		
		tableAds.setBounds(229, 143, 370, 160);
		contentPane.add(tableAds);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel tableModel = (DefaultTableModel) tableAds.getModel();
					String lblNewLabel = textAddAdsField.getText();
					String startDateLabel = dateStartField.getText();
					String dateEndLabel = dateEndField.getText();
					 String[] data = {lblNewLabel, startDateLabel ,dateEndLabel};
					 tableModel.addRow(data);
			}
		});
		addButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		addButton.setForeground(new Color(255, 215, 0));
		addButton.setBounds(149, 188, 80, 23);
		contentPane.add(addButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = tableAds.getSelectedRow();
		        DefaultTableModel tableModel = (DefaultTableModel) tableAds.getModel();
		        if (tableAds.getSelectedRowCount() == 1) {
		            if (index != -1) {

		                tableModel.removeRow(index);
		                
		            }
		        }
			}
		});
		deleteButton.setForeground(new Color(255, 215, 0));
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		deleteButton.setBounds(149, 215, 80, 23);
		contentPane.add(deleteButton);
		
		JButton printButton = new JButton("PRINT");
		printButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		printButton.setForeground(new Color(255, 215, 0));
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				tableAds.print();
			} catch (java.awt.print.PrinterException e) {
				System.err.format("No printer found",e.getMessage());
			}
			}
		});
		printButton.setBounds(150, 244, 80, 23);
		contentPane.add(printButton);
		
		JLabel startDateLabel = new JLabel("DATE START");
		startDateLabel.setForeground(new Color(255, 215, 0));
		startDateLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		startDateLabel.setBounds(149, 46, 72, 14);
		contentPane.add(startDateLabel);
		
		dateStartField = new JTextField();
		dateStartField.setForeground(SystemColor.activeCaptionText);
		dateStartField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dateStartField.setBackground(SystemColor.control);
		dateStartField.setText("    WW/DD/YY");
		dateStartField.setBounds(149, 60, 80, 20);
		contentPane.add(dateStartField);
		dateStartField.setColumns(10);
		
		JLabel dateEndLabel = new JLabel("DATE END");
		dateEndLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateEndLabel.setForeground(new Color(255, 215, 0));
		dateEndLabel.setBounds(149, 91, 72, 14);
		contentPane.add(dateEndLabel);
		
		dateEndField = new JTextField();
		dateEndField.setBackground(SystemColor.control);
		dateEndField.setText("    WW/DD/YY");
		dateEndField.setBounds(149, 104, 82, 20);
		contentPane.add(dateEndField);
		dateEndField.setColumns(10);
		
		textAddAdsField = new JTextField();
		textAddAdsField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		textAddAdsField.setBounds(293, 70, 256, 62);
		contentPane.add(textAddAdsField);
		textAddAdsField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ADVERTISEMENT");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(377, 46, 97, 14);
		contentPane.add(lblNewLabel);
		
		Button employeebutton = new Button("EMPLOYEE");
		employeebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employeeGui frame = new employeeGui();
				frame.setVisible(true);
			}
		});
		employeebutton.setBounds(7, 102, 113, 22);
		contentPane.add(employeebutton);
		
		JButton btnNewButton = new JButton("ADVERTISEMENT");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setBounds(7, 20, 113, 23);
		contentPane.add(btnNewButton);
	}
}