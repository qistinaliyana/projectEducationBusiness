package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class financeG extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField costtextField;
	private JTextField profittextField_1;
	private JTable table;
	private JTextField monthtextField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					financeG frame = new financeG();
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
	public financeG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 361);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(126, 0, 17, 322);
		contentPane.add(scrollPane);
		
		Button button = new Button("FINANCE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 10, 110, 22);
		contentPane.add(button);
		
		Button button_2 = new Button("EMPLOYEE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employeeGui frame = new employeeGui();
				frame.setVisible(true);
			}
		});
		button_2.setBounds(10, 38, 110, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("DETAIL COURSE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailCourse frame = new detailCourse();
				frame.setVisible(true);
			}
		});
		button_3.setBounds(10, 66, 110, 22);
		contentPane.add(button_3);
		
		Button button_4 = new Button("ADVERTISEMENT");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				advertisementandMarketing frame = new advertisementandMarketing();
				frame.setVisible(true);
			}
		});
		button_4.setBounds(10, 94, 110, 22);
		contentPane.add(button_4);
		
		JButton btnNewButton = new JButton("HOME PAGE");
		btnNewButton.setForeground(new Color(255, 215, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to back Main menu?", "", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					mainGui frame = new mainGui();
					frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setBounds(10, 264, 100, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("FINANCE");
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setBackground(new Color(240, 230, 140));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(332, 18, 91, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
					String  lblNewLabel_1 =costtextField.getText();
					String lblNewLabel_2 = profittextField_1.getText();
					String lblNewLabel_3 = monthtextField_2.getText();
					
					 String[] data = {lblNewLabel_1,lblNewLabel_2 ,lblNewLabel_3};
					 tableModel.addRow(data);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 215, 0));
		btnNewButton_1.setBounds(159, 199, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DEETE");
		btnNewButton_2.setForeground(new Color(255, 215, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(159, 234, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found",e.getMessage());
				}
			}
		});
		btnNewButton_3.setForeground(new Color(255, 215, 0));
		btnNewButton_3.setBounds(159, 268, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Cost Adv");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(179, 81, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		costtextField = new JTextField();
		costtextField.setBounds(260, 78, 86, 20);
		contentPane.add(costtextField);
		costtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Net Profit");
		lblNewLabel_2.setForeground(new Color(255, 215, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(179, 106, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		profittextField_1 = new JTextField();
		profittextField_1.setBounds(260, 103, 86, 20);
		contentPane.add(profittextField_1);
		profittextField_1.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"COST ADV", "NET PROFIT", "MONTH"},
				
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(282, 191, 286, 80);
		contentPane.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("Month");
		lblNewLabel_3.setForeground(new Color(255, 215, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(179, 131, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		monthtextField_2 = new JTextField();
		monthtextField_2.setBounds(260, 127, 86, 20);
		contentPane.add(monthtextField_2);
		monthtextField_2.setColumns(10);
	}
}
