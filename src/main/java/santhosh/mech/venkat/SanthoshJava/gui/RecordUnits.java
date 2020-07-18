package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.io.FileUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordUnits extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordUnits frame = new RecordUnits();
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
	public RecordUnits() {
		setResizable(false);
		setTitle("Record Unit Reading");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTakeReadingTo = new JLabel("Take Reading to record");
		lblTakeReadingTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblTakeReadingTo.setBounds(127, 11, 222, 21);
		contentPane.add(lblTakeReadingTo);
		
		JLabel lblChooseConnectionNumber = new JLabel("Choose Connection Number");
		lblChooseConnectionNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChooseConnectionNumber.setBounds(20, 54, 200, 21);
		contentPane.add(lblChooseConnectionNumber);
		
		JLabel lblChoosenConnectionNumber = new JLabel("Choosen Connection Number is:");
		lblChoosenConnectionNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChoosenConnectionNumber.setBounds(20, 151, 462, 144);
		contentPane.add(lblChoosenConnectionNumber);
		
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\EB");
		String[] names=file.list();
		JList list = new JList(names);
		list.setBounds(318, 57, 136, 72);
		contentPane.add(list);
		list.addMouseListener(new MouseListener() {		
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try {
					File temp=new File(file+"\\"+(String)list.getSelectedValue());
					lblChoosenConnectionNumber.setText(FileUtils.readFileToString(temp));
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});
		
		textField = new JTextField();
		textField.setToolTipText("Enter the date");
		textField.setBounds(46, 317, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter the units");
		textField_1.setBounds(214, 317, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Enter the price");
		textField_2.setBounds(358, 317, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp="";
				temp+=textField.getText()+"\t";
				temp+=textField_1.getText()+"\t";
				temp+=textField_2.getText()+"\n";
				File temps=new File(file+"\\"+(String)list.getSelectedValue());
				try {
					FileUtils.writeStringToFile(temps, temp, true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(RecordUnits.this, "Units Readed");
				list.clearSelection();
				lblChoosenConnectionNumber.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnRecord.setBounds(221, 359, 89, 23);
		contentPane.add(btnRecord);
	}
}