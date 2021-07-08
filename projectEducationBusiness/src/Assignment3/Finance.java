package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldcost;
	private JTextField textFieldsell;
	private JTextField textFieldtotal;
	private JTable table;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel FinanceLabel;
	private JButton DeleteButton;
	private JButton UploadButton;
	private JButton resetButton;
	private JButton TotalButton;
	private JButton EnterButton;
	private JButton ExitButton;
	private JButton PrintButton;
	private JLabel CostLabel;
	private JLabel SellLabel;
	private JLabel lblProfitLoss;
	private JLabel yearLabel;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenuaboutus;
	private JMenu mnNewMenuFinance;
	private JMenu mnNewMenustudents;
	private JMenuItem AdsMenuItem;
	private JMenuItem financeMenuItem;
	private JMenuItem SalesMenuItem;
	private JMenuItem IntelleqMenuItem;
	private JMenuItem EmployeeMenuItem;
	private JTextField textFieldYEAR;
	private double cost;
	private String salary;
	private String sel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {	
        
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\Saved Pictures\\bus.png"));
		setTitle("Software Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1148, 566);
        
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 228, 225));
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
		
		EmployeeMenuItem = new JMenuItem("Employee");
		EmployeeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		mnNewMenuaboutus.add(EmployeeMenuItem);
		
		mnNewMenuFinance = new JMenu("Finance");
		menuBar.add(mnNewMenuFinance);
		
		financeMenuItem = new JMenuItem("Finance");
		mnNewMenuFinance.add(financeMenuItem);
		
		SalesMenuItem = new JMenuItem("Sales");
		SalesMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales frame = new Sales();
				frame.setVisible(true);
			}
		});
		mnNewMenuFinance.add(SalesMenuItem);
		
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(null);
		panel.setBounds(0, 0, 1134, 504);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel1.setBackground(new Color(47, 79, 79));
		panel1.setBounds(21, 25, 1091, 84);
		panel.add(panel1);
		
		FinanceLabel = new JLabel("FINANCE");
		FinanceLabel.setForeground(new Color(255, 255, 255));
		Image img1 = new ImageIcon(this.getClass().getResource("/finance.png")).getImage();
		FinanceLabel.setIcon(new ImageIcon(img1));
		FinanceLabel.setFont(new Font("Times New Roman", Font.BOLD, 33));
		FinanceLabel.setBounds(468, 11, 201, 62);
		panel1.add(FinanceLabel);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(176, 224, 230)));
		panel2.setBackground(new Color(47, 79, 79));
		panel2.setBounds(21, 413, 1091, 71);
		panel.add(panel2);
		
		TotalButton = new JButton("TOTAL ");
		TotalButton.setBackground(new Color(224, 255, 255));
		TotalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double num1, num2, ans;
					
					try {
						num1 = Integer.parseInt(textFieldsell.getText());
						num2 = Integer.parseInt(textFieldcost.getText());
						
						
						
						ans = num1 - num2;
						textFieldtotal.setText(Double.toString(ans));
						
	    			} catch(Exception e1) {
	    				JOptionPane.showMessageDialog(null, "Invalid Number.");
	    			}
			}
		});
		TotalButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		TotalButton.setBounds(10, 11, 131, 47);
		panel2.add(TotalButton);
		
		EnterButton = new JButton("ENTER");
		EnterButton.setBackground(new Color(224, 255, 255));
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

	    		model.addRow(new Object[]{
	    				textFieldYEAR.getText(),
	    				textFieldcost.getText(),
	    				textFieldsell.getText(),
	    				textFieldtotal.getText(),
	    				
	    
	    		});
	    		if (table.getSelectedRow() == -1) {
	    			if (table.getRowCount() == 0) {
	    				JOptionPane.showMessageDialog(null, "Update confirmed", "Finance System",
	    						JOptionPane.OK_OPTION);
	    			}
	    		}
            
			}
        
		});
		EnterButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		EnterButton.setBounds(157, 11, 131, 47);
		panel2.add(EnterButton);
		
		resetButton = new JButton("RESET");
		resetButton.setBackground(new Color(224, 255, 255));
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldYEAR.setText("");
				textFieldcost.setText("");
				textFieldsell.setText("");
				textFieldtotal.setText("");
			}
		});
		resetButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		resetButton.setBounds(305, 11, 131, 47);
		panel2.add(resetButton);
		
		UploadButton = new JButton("UPLOAD");
		UploadButton.setBackground(new Color(224, 255, 255));
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File ("C:\\Users\\HP\\git\\Assignment3\\Assignment 3\\src\\Assignment3\\finance.txt");
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
		UploadButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		UploadButton.setBounds(655, 11, 131, 47);
		panel2.add(UploadButton);
		
		DeleteButton = new JButton("DELETE");
		DeleteButton.setBackground(new Color(224, 255, 255));
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		DeleteButton.setBounds(804, 11, 131, 47);
		panel2.add(DeleteButton);
		
		ExitButton = new JButton("EXIT");
		ExitButton.setBackground(new Color(224, 255, 255));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		ExitButton.setBounds(950, 11, 131, 47);
		panel2.add(ExitButton);
		
		PrintButton = new JButton("PRINT");
		PrintButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					model.setValueAt(textFieldYEAR.getText(),i,0);
			    	model.setValueAt(textFieldcost.getText(),i,1);
			    	model.setValueAt(textFieldsell.getText(),i,2);
			    	model.setValueAt(textFieldtotal.getText(),i,3);
			    	    
					JOptionPane.showMessageDialog(null, "Print Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PrintButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		PrintButton.setBackground(new Color(224, 255, 255));
		PrintButton.setBounds(506, 11, 131, 47);
		panel2.add(PrintButton);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(175, 238, 238)));
		panel3.setBackground(new Color(47, 79, 79));
		panel3.setBounds(21, 120, 498, 282);
		panel.add(panel3);
		
		CostLabel = new JLabel("The Cost price : RM ");
		CostLabel.setForeground(new Color(255, 255, 255));
		CostLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		CostLabel.setBounds(34, 26, 217, 43);
		panel3.add(CostLabel);
		
		SellLabel = new JLabel("The Selling price : RM ");
		SellLabel.setForeground(new Color(255, 255, 255));
		SellLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		SellLabel.setBounds(34, 90, 244, 43);
		panel3.add(SellLabel);
		
		textFieldcost = new JTextField();
		textFieldcost.setBackground(Color.WHITE);
		textFieldcost.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldcost.setBounds(280, 26, 186, 43);
		panel3.add(textFieldcost);
		textFieldcost.setColumns(10);
		
		textFieldsell = new JTextField();
		textFieldsell.setBackground(Color.WHITE);
		textFieldsell.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldsell.setColumns(10);
		textFieldsell.setBounds(280, 90, 186, 43);
		panel3.add(textFieldsell);
		
		textFieldtotal = new JTextField();
		textFieldtotal.setForeground(Color.WHITE);
		textFieldtotal.setBackground(new Color(47, 79, 79));
		textFieldtotal.setSelectedTextColor(new Color(47, 79, 79));
		textFieldtotal.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldtotal.setColumns(10);
		textFieldtotal.setBounds(280, 217, 186, 43);
		panel3.add(textFieldtotal);
		
		lblProfitLoss = new JLabel("Netprofit : RM ");
		lblProfitLoss.setForeground(new Color(255, 255, 255));
		lblProfitLoss.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblProfitLoss.setBounds(34, 217, 244, 43);
		panel3.add(lblProfitLoss);
		
		yearLabel = new JLabel("Enter the Year :  ");
		yearLabel.setForeground(new Color(255, 255, 255));
		yearLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		yearLabel.setBounds(34, 151, 217, 43);
		panel3.add(yearLabel);
		
		textFieldYEAR = new JTextField();
		textFieldYEAR.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textFieldYEAR.setColumns(10);
		textFieldYEAR.setBounds(280, 151, 186, 43);
		panel3.add(textFieldYEAR);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(175, 238, 238)));
		panel4.setBackground(new Color(47, 79, 79));
		panel4.setBounds(529, 120, 583, 282);
		panel.add(panel4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(175, 238, 238), new Color(175, 238, 238), new Color(175, 238, 238), new Color(175, 238, 238)));
		scrollPane.setBounds(10, 11, 563, 260);
		panel4.add(scrollPane);
		
		table = new JTable();
		table.setSelectionForeground(SystemColor.windowText);
		table.setSelectionBackground(new Color(176, 224, 230));
		table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(175, 238, 238), new Color(175, 238, 238), new Color(175, 238, 238), new Color(175, 238, 238)));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"YEAR", "COST PRICE (RM)", "SELLING PRICE (RM)", "PROFIT / LOSS / NUETRAL"
			}
		));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
	}

}
