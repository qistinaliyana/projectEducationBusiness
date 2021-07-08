package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JPanel Panel1;
	private JPanel Panel3;
	private JPanel Panel4;
	private JLabel SalesLabel;
	private JLabel priceCplusLabel; 
	private JLabel PricepythonLabel;
	private JLabel pricejavaLabel;
	private JTextField textFieldpricep;
	private JButton AddButton;
	private JButton ExitButton;
	private JButton ResetButton;
	private JButton DeleteButton;
	private JButton UploadButton;
	private JTable table;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenuaboutus;
	private JMenuItem IntelleqMenuItem;
	private JMenuItem employeeMenuItem;
	private JMenu mnNewMenufinance;
	private JMenuItem FinanceMenuItem;
	private JMenuItem SalesMenuItem;
	private JMenu mnNewMenustudents;
	private JMenuItem AdsMenuItem;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldpricej;
	private JTextField textFieldpricec;
	private JButton btnPrint;
	private String s, s1,s2;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Sales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 697);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 224));
		setJMenuBar(menuBar);
		
		mnNewMenuaboutus = new JMenu("About Us");
		menuBar.add(mnNewMenuaboutus);
		
		IntelleqMenuItem = new JMenuItem("Intelleq QS");
		IntelleqMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareTraining frame = new SoftwareTraining();
				frame.setVisible(true);
			}
		});
		mnNewMenuaboutus.add(IntelleqMenuItem);
		
		employeeMenuItem = new JMenuItem("Employee");
		employeeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		mnNewMenuaboutus.add(employeeMenuItem);
		
		mnNewMenufinance = new JMenu("Finance");
		menuBar.add(mnNewMenufinance);
		
		FinanceMenuItem = new JMenuItem("Finance");
		FinanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
			}
		});
		mnNewMenufinance.add(FinanceMenuItem);
		
		SalesMenuItem = new JMenuItem("Sales");
		mnNewMenufinance.add(SalesMenuItem);
		
		mnNewMenustudents = new JMenu("Student reviews");
		menuBar.add(mnNewMenustudents);
		
		AdsMenuItem = new JMenuItem("Advertisement");
		AdsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
			}
		});
		mnNewMenustudents.add(AdsMenuItem);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel1 = new JPanel();
		Panel1.setLayout(null);
		Panel1.setBorder(null);
		Panel1.setBackground(new Color(47, 79, 79));
		Panel1.setBounds(91, 22, 1132, 59);
		contentPane.add(Panel1);
		
		SalesLabel = new JLabel("SALES");
		SalesLabel.setForeground(new Color(255, 255, 255));
		Image img1 = new ImageIcon(this.getClass().getResource("/sales.png")).getImage();
		SalesLabel.setIcon(new ImageIcon(img1));
		SalesLabel.setFont(new Font("Times New Roman", Font.BOLD, 38));
		SalesLabel.setBounds(479, 11, 172, 37);
		Panel1.add(SalesLabel);
		
		Panel3 = new JPanel();
		Panel3.setLayout(null);
		Panel3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.ORANGE));
		Panel3.setBackground(new Color(95, 158, 160));
		Panel3.setBounds(91, 86, 1132, 219);
		contentPane.add(Panel3);
		
		textFieldpricep = new JTextField();
		textFieldpricep.setText("Key in price");
		textFieldpricep.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textFieldpricep.setColumns(10);
		textFieldpricep.setBounds(345, 86, 194, 38);
		Panel3.add(textFieldpricep);
		
	    AddButton = new JButton("ADD RECORD");
	    AddButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    AddButton.setForeground(new Color(255, 255, 255));
	    AddButton.setBackground(new Color(47, 79, 79));
	    AddButton.setBounds(726, 108, 177, 38);
	    Panel3.add(AddButton);
	    AddButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    		
	    		DefaultTableModel model = (DefaultTableModel) table.getModel();

	    		model.addRow(new Object[]{
	    				textFieldpricej.getText(),
	    				textFieldpricep.getText(),
	    				textFieldpricec.getText(),		
	    
	    		});
                 //How to read data in table
				
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
			        s = String.valueOf(model.getValueAt(i, 0));
			        s1 = String.valueOf(model.getValueAt(i, 1));
			        s2 = String.valueOf(model.getValueAt(i, 2));
			       
				}
				//How to pass value/data from product description (admin page) into customer page
				try {
					Customer r = new Customer(s, s1, s2); //open customer page using constructor with 3 arguments
					r.setVisible(true);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
	    		if (table.getSelectedRow() == -1) {
	    			if (table.getRowCount() == 0) {
	    				JOptionPane.showMessageDialog(null, "Add record confirmed", "Sales Management System",
	    						JOptionPane.OK_OPTION);
	    			}
	    		}
               
	    	}
	    	
	    });
	    AddButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    
	    priceCplusLabel = new JLabel("Enter the price C++ : RM");
	    priceCplusLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    priceCplusLabel.setBounds(45, 144, 243, 45);
	    Panel3.add(priceCplusLabel);
	    
	    pricejavaLabel = new JLabel("Enter the price java : RM");
	    pricejavaLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    pricejavaLabel.setBounds(45, 14, 243, 55);
	    Panel3.add(pricejavaLabel);
	    
	    textFieldpricej = new JTextField();
	    textFieldpricej.setText("Key in price");
	    textFieldpricej.setFont(new Font("Times New Roman", Font.ITALIC, 19));
	    textFieldpricej.setColumns(10);
	    textFieldpricej.setBounds(345, 23, 194, 38);
	    Panel3.add(textFieldpricej);
	    
	    textFieldpricec = new JTextField();
	    textFieldpricec.setText("Key in price");
	    textFieldpricec.setFont(new Font("Times New Roman", Font.ITALIC, 18));
	    textFieldpricec.setColumns(10);
	    textFieldpricec.setBounds(345, 149, 194, 38);
	    Panel3.add(textFieldpricec);
	    
	    ResetButton = new JButton("RESET");
	    ResetButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    ResetButton.setBounds(726, 36, 177, 38);
	    Panel3.add(ResetButton);
	    ResetButton.setForeground(new Color(255, 255, 255));
	    ResetButton.setBackground(new Color(47, 79, 79));
	    ResetButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textFieldpricej.setText("");
	    		textFieldpricep.setText("");
	    		textFieldpricec.setText("");
	    		
	    		
	    	}
	    });
	    ResetButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
	    
	    PricepythonLabel = new JLabel("Enter the price Python : RM");
	    PricepythonLabel.setBounds(45, 77, 305, 55);
	    Panel3.add(PricepythonLabel);
	    PricepythonLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		Panel4 = new JPanel();
		Panel4.setLayout(null);
		Panel4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.ORANGE));
		Panel4.setBackground(new Color(240, 230, 140));
		Panel4.setBounds(91, 327, 914, 239);
		contentPane.add(Panel4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0)));
		scrollPane.setBounds(10, 11, 894, 217);
		Panel4.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0)));
		table.setBackground(new Color(255, 255, 255));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Java (RM)", "Python (RM)", "C++ (RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		DeleteButton = new JButton("DELETE");
		DeleteButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		DeleteButton.setForeground(new Color(255, 255, 255));
		DeleteButton.setBounds(1015, 424, 119, 42);
		contentPane.add(DeleteButton);
		DeleteButton.setBackground(new Color(47, 79, 79));
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null,"No data to delete",
								"Sales Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Sales Management System", JOptionPane.CANCEL_OPTION);
					}
					} else {
					model.removeRow(table.getSelectedRow());
				   }
		     }
		});
		DeleteButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		
		UploadButton = new JButton("UPLOAD");
		UploadButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		UploadButton.setForeground(new Color(255, 255, 255));
		UploadButton.setBounds(1015, 524, 119, 42);
		contentPane.add(UploadButton);
		UploadButton.setBackground(new Color(47, 79, 79));
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File ("C:\\Users\\HP\\git\\Assignment3\\Assignment 3\\src\\Assignment3\\sales.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
						for (int n=0; n<table.getRowCount(); n++) {
							for (int p=0; p<table.getColumnCount(); p++) {
								bw.write(table.getModel().getValueAt(n, p) + "  ");
								}
						bw.write("\n------------\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
				}
				
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		UploadButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		ExitButton = new JButton("EXIT");
		ExitButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ExitButton.setForeground(new Color(255, 255, 255));
		ExitButton.setBounds(1154, 585, 119, 42);
		contentPane.add(ExitButton);
		ExitButton.setBackground(new Color(47, 79, 79));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sales  System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		ExitButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		
		btnPrint = new JButton("PRINT");
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldpricej.getText(),i,0);
			    	model.setValueAt(textFieldpricep.getText(),i,1);
			    	model.setValueAt(textFieldpricec.getText(),i,2);
			    	    
					JOptionPane.showMessageDialog(null, "Print Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPrint.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnPrint.setBackground(new Color(47, 79, 79));
		btnPrint.setBounds(1015, 327, 119, 42);
		contentPane.add(btnPrint);
	}
}
