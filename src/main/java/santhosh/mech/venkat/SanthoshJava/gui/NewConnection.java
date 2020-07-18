package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.io.FileUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class NewConnection extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewConnection frame = new NewConnection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public NewConnection() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Adding New Connection");
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 110, 120, 82);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.RED);
		textArea.setBackground(Color.ORANGE);
		scrollPane.setViewportView(textArea);
		
		JLabel lblAddingNewConnection = new JLabel("Adding New Connection");
		lblAddingNewConnection.setForeground(Color.RED);
		lblAddingNewConnection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblAddingNewConnection.setBounds(129, 11, 219, 20);
		contentPane.add(lblAddingNewConnection);
		
		JLabel lblConnectionNumber = new JLabel("Connection Number");
		lblConnectionNumber.setForeground(Color.RED);
		lblConnectionNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConnectionNumber.setBounds(42, 54, 144, 17);
		contentPane.add(lblConnectionNumber);
		
		JLabel lblConnectionHolderName = new JLabel("Connection Holder name");
		lblConnectionHolderName.setForeground(Color.RED);
		lblConnectionHolderName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConnectionHolderName.setBounds(42, 82, 180, 17);
		contentPane.add(lblConnectionHolderName);
		
		JLabel lblConnectionAddress = new JLabel("Connection Address");
		lblConnectionAddress.setForeground(Color.RED);
		lblConnectionAddress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConnectionAddress.setBounds(42, 110, 144, 17);
		contentPane.add(lblConnectionAddress);
		
		JLabel lblConnectionType = new JLabel("Connection Type");
		lblConnectionType.setForeground(Color.RED);
		lblConnectionType.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConnectionType.setBounds(42, 201, 144, 17);
		contentPane.add(lblConnectionType);
		
		JLabel lblConnectionUsageType = new JLabel("Connection Usage type");
		lblConnectionUsageType.setForeground(Color.RED);
		lblConnectionUsageType.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConnectionUsageType.setBounds(42, 240, 144, 17);
		contentPane.add(lblConnectionUsageType);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.ORANGE);
		textField.setBounds(266, 42, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setBackground(Color.ORANGE);
		textField_1.setBounds(266, 81, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setForeground(Color.RED);
		rdbtnSingle.setBackground(Color.ORANGE);
		rdbtnSingle.setBounds(254, 199, 63, 23);
		contentPane.add(rdbtnSingle);
		
		JRadioButton rdbtnThreePhase = new JRadioButton("Three Phase");
		rdbtnThreePhase.setForeground(Color.RED);
		rdbtnThreePhase.setBackground(Color.ORANGE);
		rdbtnThreePhase.setBounds(319, 199, 98, 23);
		contentPane.add(rdbtnThreePhase);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnSingle);
		bg.add(rdbtnThreePhase);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Purpose", "Domestic", "Commercial"}));
		comboBox.setForeground(Color.RED);
		comboBox.setBackground(Color.ORANGE);
		comboBox.setBounds(266, 238, 120, 22);
		contentPane.add(comboBox);
		
		JButton btnEnroll = new JButton("Enroll");
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!comboBox.getSelectedItem().equals("Select Purpose")&&
						!textField.getText().equals("")&&!textField_1.getText().equals("")
						&&!textArea.getText().equals("")&&
						textField.getText().matches("[0-9]+"))
				{
					File file=
					new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\"+
					textField.getText()+".doc");
					String temp="";
					temp+="Connection number: "+textField.getText()+"\n";
					temp+="Holder name: "+textField_1.getText()+"\n";
					temp+="Connection Address: "+textArea.getText()+"\n";
					if(rdbtnSingle.isSelected())
					{
						temp+="Connection Type: "+rdbtnSingle.getText()+"\n";
					}
					else
					{
						temp+="Connection Type: "+rdbtnThreePhase.getText()+"\n";
					}
					temp+="Connection purpose: "+comboBox.getSelectedItem()+"\n";
					try {
						FileUtils.writeStringToFile(file, temp);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(NewConnection.this, "Connection created");
				}
				else {JOptionPane.showMessageDialog(NewConnection.this, "Enter valid details");}
			}
		});
		btnEnroll.setBackground(Color.ORANGE);
		btnEnroll.setForeground(Color.RED);
		btnEnroll.setBounds(133, 285, 89, 23);
		contentPane.add(btnEnroll);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textArea.setText("");
				
			}
		});
		btnClear.setBackground(Color.ORANGE);
		btnClear.setForeground(Color.RED);
		btnClear.setBounds(232, 285, 89, 23);
		contentPane.add(btnClear);
	}
}
