package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Admin_login extends JFrame {
	Admin ad;
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
					Admin_login frame = new Admin_login();
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
	public Admin_login(Admin ad) {
		//Admin admin = new Admin();
		this.ad=ad;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 546);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          Welcome to Admin Login");
		lblNewLabel.setBounds(307, 36, 237, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(90, 143, 92, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(179, 140, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile number");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setBounds(93, 190, 89, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 187, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email id");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(90, 238, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 238, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Press me!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=textField.getText();
				String mobile_num=(textField_1.getText());
				String email_id=textField_2.getText();
				Admin admin = new Admin(name,mobile_num,email_id);
				if(name.equals(ad.name) && mobile_num.equals(ad.mobile_num) && email_id.equalsIgnoreCase(ad.email_id)) {
					Admin_interface frame = new Admin_interface(ad);
					frame.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Check the credentials again");
				}
				//admin.mobile_num=(lblNewLabel_2.getText());
				//JOptionPane.showMessageDialog(null, name);
				
			}
		});
		btnNewButton.setBounds(345, 304, 119, 21);
		contentPane.add(btnNewButton);
	}
}
