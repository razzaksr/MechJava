package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.io.FileUtils;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fetch extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fetch frame = new Fetch();
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
	public Fetch() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Know the Bill by date");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblBillDetails = new JLabel("Bill details");
		lblBillDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblBillDetails.setBounds(165, 11, 119, 35);
		contentPane.add(lblBillDetails);
		
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\EB");
		String[] names=file.list();
		JList list = new JList(names);
		list.setBounds(140, 49, 136, 72);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(161, 147, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGetBill = new JButton("Get Bill");
		btnGetBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File temp=new File(file+"\\"+(String)list.getSelectedValue());
					List<String> lines=FileUtils.readLines(temp);
					for(int in=0;in<lines.size();in++)
					{
						if(lines.get(in).contains(textField.getText()))
						{
							JOptionPane.showMessageDialog(Fetch.this, lines.get(in));
						}
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGetBill.setBounds(165, 198, 89, 23);
		contentPane.add(btnGetBill);
	}

}
