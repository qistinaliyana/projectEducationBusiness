package EBookWriting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class detailCourse extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField coursenametextField;
	private JTextField durationtextField_1;
	private JTextField nametextField_2;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detailCourse frame = new detailCourse();
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
	public detailCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 361);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(SystemColor.activeCaptionBorder);
		scrollPane.setBounds(127, 0, 17, 322);
		contentPane.add(scrollPane);
		
		Button button = new Button("DETAIL COURSE");
		button.setBounds(10, 25, 111, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("ADVERTISEMENT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				advertisementandMarketing frame = new advertisementandMarketing();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(10, 53, 111, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("FINANCE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				financeG frame = new financeG();
				frame.setVisible(true);	}
		});
		button_2.setBounds(10, 81, 111, 22);
		contentPane.add(button_2);
		
		Button button_4 = new Button("EMPLOYEE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employeeGui frame = new employeeGui();
				frame.setVisible(true);}
		});
		button_4.setBounds(10, 109, 111, 22);
		contentPane.add(button_4);
		
		JLabel lblNewLabel = new JLabel("COURSE DETAIL");
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(285, 11, 156, 14);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"COURSE NAME", "DURATION", "AMOUNT"},
				
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(262, 184, 325, 115);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("HOME PAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to back Main menu?", "", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					mainGui frame = new mainGui();
					frame.setVisible(true);
				}}
		});
		btnNewButton.setBounds(10, 259, 111, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Course name");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(180, 81, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		coursenametextField = new JTextField();
		coursenametextField.setBounds(262, 78, 86, 20);
		contentPane.add(coursenametextField);
		coursenametextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Duration");
		lblNewLabel_2.setForeground(new Color(255, 215, 0));
		lblNewLabel_2.setBounds(180, 109, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		durationtextField_1 = new JTextField();
		durationtextField_1.setBounds(262, 106, 86, 20);
		contentPane.add(durationtextField_1);
		durationtextField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("AMOUNT");
		lblNewLabel_3.setForeground(new Color(255, 215, 0));
		lblNewLabel_3.setBounds(180, 137, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nametextField_2 = new JTextField();
		nametextField_2.setBounds(262, 134, 86, 20);
		contentPane.add(nametextField_2);
		nametextField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			String lblNewLabel_1 = coursenametextField.getText();
			String lblNewLabel_2 = durationtextField_1.getText();
			String lblNewLabel_3 = nametextField_2.getText();
			 String[] data = {lblNewLabel_1, lblNewLabel_2,lblNewLabel_3};
			 tableModel.addRow(data);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 215, 0));
		btnNewButton_1.setBounds(152, 180, 86, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
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
		btnNewButton_2.setForeground(new Color(255, 215, 0));
		btnNewButton_2.setBounds(150, 214, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found",e.getMessage());
				}}
		});
		btnNewButton_3.setForeground(new Color(255, 215, 0));
		btnNewButton_3.setBounds(150, 248, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}