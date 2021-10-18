import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class JavaEclipsePOS {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtBarCode;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaEclipsePOS window = new JavaEclipsePOS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaEclipsePOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//======================================== Functions ========================================
	public void ItemCost() {
		double sum = 0;
		double tax = 3.9;
		for (int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		jtxtSubTotal.setText(Double.toString(sum));
		double cTotal = Double.parseDouble(jtxtSubTotal.getText());
		
		double cTax = (cTotal * tax)/100;
		String iTaxTotal = String.format("$ %.2f", cTax);
		jtxtTax.setText(iTaxTotal);
		
		String iSubTotal = String.format("$ %.2f", cTotal);
		jtxtSubTotal.setText(iSubTotal);
		
		String iTotal = String.format("$ %.2f", cTotal + cTax);
		jtxtTotal.setText(iTotal);
		
		String BarCode = String.format("Total is %.2f", cTotal + cTax);
		jtxtBarCode.setText(BarCode);
	}
	
	//======================================== Functions ========================================
	public void Change() {
		double sum = 0;
		double tax = 3.9;
		double cash = Double.parseDouble(jtxtDisplay.getText());
		
		for (int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		double cTax = (sum * tax)/100;
		double cChange = (cash - (sum + cTax));
		String ChangeGiven = String.format("$ %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
	}
	
	//======================================== Functions ========================================
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 10, 315, 413);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn7.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn7.setBounds(12, 10, 90, 90);
		panel.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn8.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn8.setBounds(114, 10, 90, 90);
		panel.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn9.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn9.setBounds(216, 10, 90, 90);
		panel.add(jbtn9);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn4.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn4.setBounds(12, 110, 90, 90);
		panel.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn5.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn5.setBounds(114, 110, 90, 90);
		panel.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn6.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn6.setBounds(216, 110, 90, 90);
		panel.add(jbtn6);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn0.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn0.setBounds(12, 310, 90, 90);
		panel.add(jbtn0);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (! jtxtDisplay.getText().contains(".")) {
					jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
				}
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnDot.setBounds(114, 310, 90, 90);
		panel.add(jbtnDot);
		
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnC.setBounds(216, 310, 90, 90);
		panel.add(jbtnC);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn1.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn1.setBounds(12, 210, 90, 90);
		panel.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn2.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn2.setBounds(114, 210, 90, 90);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if (Enternumber == "") {
					jtxtDisplay.setText(jbtn3.getText());
				} else {
					Enternumber = jtxtDisplay.getText() + jbtn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn3.setBounds(216, 210, 90, 90);
		panel.add(jbtn3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(685, 10, 673, 413);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtn01 = new JButton("");
		jbtn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 2.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"01", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn01.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\01.jpg"));
		jbtn01.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn01.setBounds(12, 10, 120, 120);
		panel_1.add(jbtn01);
		
		JButton jbtn02 = new JButton("");
		jbtn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 3.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"02", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn02.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\02.jpg"));
		jbtn02.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn02.setBounds(144, 10, 120, 120);
		panel_1.add(jbtn02);
		
		JButton jbtn03 = new JButton("");
		jbtn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"03", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn03.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\03.jpg"));
		jbtn03.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn03.setBounds(276, 10, 120, 120);
		panel_1.add(jbtn03);
		
		JButton jbtn04 = new JButton("");
		jbtn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"04", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn04.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\04.jpg"));
		jbtn04.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn04.setBounds(408, 10, 120, 120);
		panel_1.add(jbtn04);
		
		JButton jbtn05 = new JButton("");
		jbtn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"05", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn05.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\05.jpg"));
		jbtn05.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn05.setBounds(540, 10, 120, 120);
		panel_1.add(jbtn05);
		
		JButton jbtn10 = new JButton("");
		jbtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"10", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn10.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\10.jpg"));
		jbtn10.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn10.setBounds(540, 140, 120, 120);
		panel_1.add(jbtn10);
		
		JButton jbtn09 = new JButton("");
		jbtn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"09", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn09.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\09.jpg"));
		jbtn09.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn09.setBounds(408, 140, 120, 120);
		panel_1.add(jbtn09);
		
		JButton jbtn08 = new JButton("");
		jbtn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"08", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn08.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\08.jpg"));
		jbtn08.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn08.setBounds(276, 140, 120, 120);
		panel_1.add(jbtn08);
		
		JButton jbtn07 = new JButton("");
		jbtn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 3.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"07", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn07.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\07.jpg"));
		jbtn07.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn07.setBounds(144, 140, 120, 120);
		panel_1.add(jbtn07);
		
		JButton jbtn06 = new JButton("");
		jbtn06.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\06.jpg"));
		jbtn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 2.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"06", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn06.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn06.setBounds(12, 140, 120, 120);
		panel_1.add(jbtn06);
		
		JButton jbtn15 = new JButton("");
		jbtn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 6.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"15", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn15.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\15.jpg"));
		jbtn15.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn15.setBounds(540, 270, 120, 120);
		panel_1.add(jbtn15);
		
		JButton jbtn14 = new JButton("");
		jbtn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"14", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn14.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\14.jpg"));
		jbtn14.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn14.setBounds(408, 270, 120, 120);
		panel_1.add(jbtn14);
		
		JButton jbtn13 = new JButton("");
		jbtn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 4.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"13", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn13.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\13.jpg"));
		jbtn13.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn13.setBounds(276, 270, 120, 120);
		panel_1.add(jbtn13);
		
		JButton jbtn12 = new JButton("");
		jbtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 3.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"12", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn12.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\12.jpg"));
		jbtn12.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn12.setBounds(144, 270, 120, 120);
		panel_1.add(jbtn12);
		
		JButton jbtn11 = new JButton("");
		jbtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 2.57;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"11", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtn11.setIcon(new ImageIcon("C:\\Users\\seohe\\Desktop\\11.jpg"));
		jbtn11.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn11.setBounds(12, 270, 120, 120);
		panel_1.add(jbtn11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(12, 433, 1346, 200);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(12, 33, 430, 136);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(12, 10, 80, 30);
		panel_3.add(lblNewLabel);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtTax.setBounds(188, 10, 230, 30);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(188, 50, 230, 30);
		panel_3.add(jtxtSubTotal);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubtotal.setBounds(12, 50, 120, 30);
		panel_3.add(lblSubtotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(188, 90, 230, 30);
		panel_3.add(jtxtTotal);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(12, 90, 80, 30);
		panel_3.add(lblNewLabel_1_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(904, 33, 430, 136);
		panel_2.add(panel_3_1);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcboPayment.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPay.setBounds(12, 10, 125, 50);
		panel_3_1.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page (0, number, integer)");
				
				try {
					table.print(JTable.PrintMode.NORMAL,header,footer);
				}
				catch (PrinterException ex) {
					System.err.format("No Printer found", ex.getMessage());
				}
			}
		});
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPrint.setBounds(149, 10, 125, 50);
		panel_3_1.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				jtxtBarCode.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnReset.setBounds(286, 10, 125, 50);
		panel_3_1.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				if (RemoveItem >= 0) {
					model.removeRow(RemoveItem);
				}
				
				ItemCost();
				
				if (jcboPayment.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtnRemove.setBounds(12, 70, 190, 50);
		panel_3_1.add(jbtnRemove);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of Sale", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnExit.setBounds(221, 70, 190, 50);
		panel_3_1.add(jbtnExit);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1_1.setBounds(454, 33, 430, 136);
		panel_2.add(panel_3_1_1);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(188, 56, 230, 30);
		panel_3_1_1.add(jtxtDisplay);
		
		JLabel lblDisplayCash = new JLabel("Display Cash");
		lblDisplayCash.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDisplayCash.setBounds(12, 56, 160, 30);
		panel_3_1_1.add(lblDisplayCash);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Change");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(12, 96, 100, 30);
		panel_3_1_1.add(lblNewLabel_1_1_1);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(188, 96, 230, 30);
		panel_3_1_1.add(jtxtChange);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pay Method");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1_1_1.setBounds(12, 10, 160, 30);
		panel_3_1_1.add(lblNewLabel_1_1_1_1);
		
		JComboBox<String> jcboPayment = new JComboBox<>();
		jcboPayment.setModel(new DefaultComboBoxModel<>(new String[] {"", "Cash", "Visa Card", "Master Card"}));
		jcboPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		jcboPayment.setBounds(188, 10, 230, 30);
		panel_3_1_1.add(jcboPayment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(339, 10, 334, 360);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(0).setMinWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		jtxtBarCode = new JTextField();
		jtxtBarCode.setFont(new Font("barcode font", Font.BOLD, 36));
		jtxtBarCode.setBounds(339, 371, 334, 52);
		frame.getContentPane().add(jtxtBarCode);
		jtxtBarCode.setColumns(10);
	}
}
