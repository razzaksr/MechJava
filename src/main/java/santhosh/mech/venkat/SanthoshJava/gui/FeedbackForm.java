package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class FeedbackForm extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedbackForm frame = new FeedbackForm();
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
	public FeedbackForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Feedback");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Vector<String> head=new Vector<>();
		head.add("Technology");head.add("Preferred Updations");
		head.add("Ratings");
		
		Vector vec=new Vector();
		vec.add("Java");
		
		
		Vector<Vector> tot=new Vector<>();
		tot.add(vec);
		
		table = new JTable(tot,head);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(table, BorderLayout.CENTER);
	}

}
