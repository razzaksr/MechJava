package santhosh.mech.venkat.SanthoshJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;

public class NilaChoru extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NilaChoru frame = new NilaChoru();
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
	public NilaChoru() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		setTitle("Just for dynamic jlist");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Paneer Tikka", "Chicken Tikka", "Chicken Kabab", "Grilled Chicken", "Fish 65", "Barbeequee Fish", "Barbequee Chicken", "Mutton Biriyani", "Chicken Biriyani", "Butter Naan", "Paneer Butter Masala", "Egg Tikka"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(24, 49, 100, 239);
		contentPane.add(list);
		JList list_1 = new JList();
		list_1.setBounds(307, 49, 100, 239);
		contentPane.add(list_1);
		list.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Object[] temp=list.getSelectedValues();
				list_1.setListData(temp);
			}
		});
		
		JLabel lblAvailableDishes = new JLabel("Available dishes");
		lblAvailableDishes.setBounds(37, 11, 87, 14);
		contentPane.add(lblAvailableDishes);
		
		JLabel lblChoosedDishes = new JLabel("Choosed dishes");
		lblChoosedDishes.setBounds(307, 11, 87, 14);
		contentPane.add(lblChoosedDishes);
	}

}
