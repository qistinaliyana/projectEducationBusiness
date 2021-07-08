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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Employee extends JFrame {

	private JPanel contentPane;
    private JFrame frame;
    private JTextField textFieldID;
    private JTextField textFieldNAME;
    private JTextField textFieldDEPARTMENT;
    private JTextField textFieldAGE;
    private JButton UPLOADButton;
    private JButton DELETEButton;
    private JButton EnterButton;
    private JButton RESETButton;
    private JButton EXITButton;
    private JLabel TITLELabel;
    private JLabel IDLabel;
    private JLabel NAMELabel;
    private JLabel DEPARTMENTLabel;
    private JLabel AGELabel;
    private JLabel SALARYLabel;
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4; 
    private JScrollPane scrollPane;
    private JTable table;
    private JMenuBar menuBar;
    private JMenu mnNewMenuCompany;
    private JMenu mnNewMenucount;
    private JMenu mnNewMenuCustomer;
    private JMenuItem IntelleqMenuItem;
    private JMenuItem EmployeeMenuItem;
    private JMenuItem FinanceMenuItem;
    private JMenuItem SalesMenuItem;
    private JMenuItem AdsMenuItem;
    private JButton PRINTButton;
    private JTextField textFieldSALARY;
    private JButton salaryButton;
    private JTextField txtTotal;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1288, 695);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 128, 128));
		setJMenuBar(menuBar);
		
		mnNewMenuCompany = new JMenu("About Us");
		menuBar.add(mnNewMenuCompany);
		
		IntelleqMenuItem = new JMenuItem("Intelleq QS");
		IntelleqMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareTraining frame = new SoftwareTraining();
				frame.setVisible(true);
			}
		});
		mnNewMenuCompany.add(IntelleqMenuItem);
		
		EmployeeMenuItem = new JMenuItem("Employee");
		EmployeeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		mnNewMenuCompany.add(EmployeeMenuItem);
		
		mnNewMenucount = new JMenu("Finance");
		menuBar.add(mnNewMenucount);
		
		FinanceMenuItem = new JMenuItem("Finance");
		FinanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
			}
		});
		mnNewMenucount.add(FinanceMenuItem);
		
		SalesMenuItem = new JMenuItem("Sales");
		SalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales frame = new Sales();
				frame.setVisible(true);
			}
		});
		mnNewMenucount.add(SalesMenuItem);
		
		mnNewMenuCustomer = new JMenu("Student reviews");
		menuBar.add(mnNewMenuCustomer);
		
		AdsMenuItem = new JMenuItem("Advertisement");
		AdsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
			}
		});
		mnNewMenuCustomer.add(AdsMenuItem);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBounds(0, 0, 1276, 632);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), new Color(95, 158, 160), new Color(95, 158, 160), new Color(95, 158, 160)));
		panel1.setBackground(new Color(95, 158, 160));
		panel1.setBounds(23, 22, 1221, 62);
		panel.add(panel1);
		
		TITLELabel = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		Image img1 = new ImageIcon(this.getClass().getResource("/employee.png")).getImage();
		TITLELabel.setIcon(new ImageIcon(img1));
		TITLELabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		TITLELabel.setBounds(298, 11, 627, 45);
		panel1.add(TITLELabel);
		
	    panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel2.setBackground(new Color(224, 255, 255));
		panel2.setBounds(490, 547, 754, 68);
		panel.add(panel2);
		
	    DELETEButton = new JButton("DELETE");
	    DELETEButton.setBackground(new Color(255, 255, 255));
		DELETEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DELETEButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		DELETEButton.setBounds(10, 11, 131, 45);
		panel2.add(DELETEButton);
		
		EXITButton = new JButton("EXIT");
		EXITButton.setBackground(new Color(255, 255, 255));
		EXITButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		EXITButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		EXITButton.setBounds(606, 11, 138, 45);
		panel2.add(EXITButton);
		
		UPLOADButton = new JButton("UPLOAD");
		UPLOADButton.setBackground(new Color(255, 255, 255));
		UPLOADButton.setBounds(409, 11, 147, 45);
		panel2.add(UPLOADButton);
		UPLOADButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File ("C:\\Users\\HP\\git\\Assignment3\\Assignment 3\\src\\Assignment3\\employee.txt");
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
		});
		UPLOADButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		PRINTButton = new JButton("PRINT");
		PRINTButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldID.getText(),i,0);
			    	model.setValueAt(textFieldNAME.getText(),i,1);
			    	model.setValueAt(textFieldDEPARTMENT.getText(),i,2);
			    	model.setValueAt(textFieldAGE.getText(),i,3);
			    	model.setValueAt(textFieldSALARY.getText(),i,4);
			    	
					JOptionPane.showMessageDialog(null, "Print Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		PRINTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		PRINTButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		PRINTButton.setBackground(Color.WHITE);
		PRINTButton.setBounds(203, 11, 147, 45);
		panel2.add(PRINTButton);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel3.setBackground(new Color(224, 255, 255));
		panel3.setBounds(23, 95, 449, 441);
		panel.add(panel3);
		
		IDLabel = new JLabel("EMPLOYEE ID :");
		IDLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		IDLabel.setBounds(24, 27, 166, 58);
		panel3.add(IDLabel);
		
	    NAMELabel = new JLabel("NAME :");
		NAMELabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		NAMELabel.setBounds(24, 84, 150, 58);
		panel3.add(NAMELabel);
		
		DEPARTMENTLabel = new JLabel("DEPARTMENT :");
		DEPARTMENTLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		DEPARTMENTLabel.setBounds(24, 146, 166, 58);
		panel3.add(DEPARTMENTLabel);
		
		AGELabel = new JLabel("AGE     :");
		AGELabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		AGELabel.setBounds(24, 213, 150, 58);
		panel3.add(AGELabel);
		
		SALARYLabel = new JLabel("SALARY :");
		SALARYLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		SALARYLabel.setBounds(24, 279, 150, 58);
		panel3.add(SALARYLabel);
		
		textFieldID = new JTextField();
		textFieldID.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldID.setBounds(184, 34, 240, 44);
		panel3.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldNAME = new JTextField();
		textFieldNAME.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldNAME.setColumns(10);
		textFieldNAME.setBounds(184, 94, 240, 44);
		panel3.add(textFieldNAME);
		
		textFieldDEPARTMENT = new JTextField();
		textFieldDEPARTMENT.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldDEPARTMENT.setColumns(10);
		textFieldDEPARTMENT.setBounds(184, 154, 240, 44);
		panel3.add(textFieldDEPARTMENT);
		
		textFieldAGE = new JTextField();
		textFieldAGE.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldAGE.setColumns(10);
		textFieldAGE.setBounds(184, 221, 240, 44);
		panel3.add(textFieldAGE);
		
		EnterButton = new JButton("ENTER ");
		EnterButton.setBounds(24, 372, 138, 45);
		panel3.add(EnterButton);
		EnterButton.setBackground(new Color(255, 255, 255));
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				model.addRow(new Object[]{
						textFieldID.getText(),
						textFieldNAME.getText(),
						textFieldDEPARTMENT.getText(),
						textFieldAGE.getText(),
						textFieldSALARY.getText(),
		
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		EnterButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		RESETButton = new JButton("RESET");
		RESETButton.setBounds(277, 372, 147, 45);
		panel3.add(RESETButton);
		RESETButton.setBackground(new Color(255, 255, 255));
		RESETButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldID.setText("");
				textFieldNAME.setText("");
				textFieldDEPARTMENT.setText("");
				textFieldAGE.setText("");
				textFieldSALARY.setText("");
				
			}
		});
		RESETButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		
		textFieldSALARY = new JTextField();
		textFieldSALARY.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldSALARY.setColumns(10);
		textFieldSALARY.setBounds(184, 287, 240, 44);
		panel3.add(textFieldSALARY);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel4.setBackground(new Color(224, 255, 255));
		panel4.setBounds(490, 95, 754, 441);
		panel.add(panel4);
		
	    scrollPane = new JScrollPane();
	    scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), Color.CYAN, new Color(0, 255, 255), Color.CYAN));
		scrollPane.setBounds(10, 11, 734, 419);
		panel4.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(240, 248, 255));
		table.setSelectionForeground(new Color(224, 255, 255));
		table.setSelectionBackground(new Color(30, 144, 255));
		table.setBorder(new BevelBorder(BevelBorder.RAISED, Color.CYAN, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "NAME", "DEPARTMENT", "AGE", "SALARY"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		table.getColumnModel().getColumn(1).setPreferredWidth(86);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		table.getColumnModel().getColumn(4).setPreferredWidth(84);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		
		salaryButton = new JButton("SALARY ");
		salaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    double total = 0;
		    			
		  
		    				DefaultTableModel model = (DefaultTableModel) table.getModel();
		    				
		    			    // iterate over all columns
		    			    for (int i = 0 ; i < model.getRowCount() ; i++) {
		    			        // null or not Integer will throw exception
		    			        String r = String.valueOf(model.getValueAt(i, 4));
		    			        
		    			        total += Double.parseDouble(r);
		    			    }  
		    			        txtTotal = new JTextField();
		    					txtTotal.setText("Total ");
		    					txtTotal.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		    					txtTotal.setColumns(10);
		    					txtTotal.setBounds(176, 560, 240, 44);
		    					panel.add(txtTotal);
		    					String result=String.valueOf(total);
		    					txtTotal.setText(result);
		   
		    					JOptionPane.showConfirmDialog(frame, "Total Salary", "Customer System", JOptionPane.CANCEL_OPTION);
		   
	    			}
	    	
	    });
		salaryButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		salaryButton.setBounds(23, 558, 127, 46);
		panel.add(salaryButton);
		
		
		}
	}


