package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simple extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple frame = new Simple();
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
	public Simple() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("A Simple GUI Window");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTangedcoCustomerPortal = new JLabel("TANGEDCO Customer Portal");
		lblTangedcoCustomerPortal.setBackground(Color.WHITE);
		lblTangedcoCustomerPortal.setForeground(Color.GREEN);
		lblTangedcoCustomerPortal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblTangedcoCustomerPortal.setBounds(110, 11, 226, 14);
		contentPane.add(lblTangedcoCustomerPortal);
		
		JLabel lblConnectionNumber = new JLabel("Admin");
		lblConnectionNumber.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblConnectionNumber.setForeground(Color.GREEN);
		lblConnectionNumber.setBounds(56, 61, 134, 28);
		contentPane.add(lblConnectionNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GREEN);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPassword.setBounds(56, 117, 134, 28);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.BLACK);
		textField.setBounds(240, 65, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.GREEN);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(240, 121, 143, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("santhosh")&&passwordField.getText().equals("venkat"))
				{
					JOptionPane.showMessageDialog(Simple.this, "Welcome Admin");
					HomePage home=new HomePage();
					home.setVisible(true);
					Simple.this.dispose();
				}
				else {JOptionPane.showMessageDialog(Simple.this, "Invalid Credentials");}
			}
		});
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setBounds(128, 191, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnClear.setForeground(Color.GREEN);
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(240, 191, 89, 23);
		contentPane.add(btnClear);
	}
}
