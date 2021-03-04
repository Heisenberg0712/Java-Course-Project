package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.io.FileWriter; 
import java.io.IOException;
import java.awt.Color; 
public class UserInterface extends JFrame {
	
	private JPanel contentPane;
	private JTextField namefield;
	private JTextField contactfield;
	private JTextField emailfield;
	private JTextField addressfield;
	Admin ad;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public UserInterface(Admin ad) {
		this.ad=ad;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Shubh Vivah");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(184, 10, 324, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 80, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(23, 121, 141, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email_id");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(23, 158, 96, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(23, 199, 96, 13);
		contentPane.add(lblNewLabel_1_3);
		
		namefield = new JTextField();
		namefield.setBounds(167, 79, 96, 19);
		contentPane.add(namefield);
		namefield.setColumns(10);
		
		contactfield = new JTextField();
		contactfield.setBounds(167, 120, 96, 19);
		contentPane.add(contactfield);
		contactfield.setColumns(10);
		
		emailfield = new JTextField();
		emailfield.setBounds(167, 157, 96, 19);
		contentPane.add(emailfield);
		emailfield.setColumns(10);
		
		addressfield = new JTextField();
		addressfield.setBounds(167, 198, 96, 19);
		contentPane.add(addressfield);
		addressfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Book Wedding");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
					//JOptionPane.showMessageDialog(null,"Congrats!! you are successfully registered");
					String name_user=namefield.getText();
					String contact_user=(contactfield.getText());
					String email_id=emailfield.getText();
					String address=addressfield.getText();
					//String password =passwordfield.getText();
					int uid= (int)( Math.random()*100);
					int i,flag=0,alpha=0;
					if(name_user.length()==0 || contact_user.length()==0 || email_id.length()==0 || address.length()==0) {
						alpha=1;
					}
					for(i=0;i<contact_user.length();i++) {
						if((contact_user.charAt(i)>='a' && contact_user.charAt(i)<='z')||(contact_user.charAt(i)>='A' && contact_user.charAt(i)<='Z')) {
							JOptionPane.showMessageDialog(null, "please enter a correct phone number");
							break;
						}
					}
					if(contact_user.length()!=10 || alpha==1) {
						JOptionPane.showMessageDialog(null,"Please enter the correct details");
						flag=1;
					}
					if(i==contact_user.length() && flag==0 && alpha==0) {
						User us = new User(uid,name_user,contact_user,email_id,address);
						BookWedding frame = new BookWedding(ad,us);
						frame.setVisible(true);
						dispose();
					}
					
					
				
			}
		});
		btnNewButton.setBounds(258, 322, 141, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Please enter your details to proceed to book a wedding with us");
		lblNewLabel_2.setBounds(167, 356, 341, 54);
		contentPane.add(lblNewLabel_2);
	}
}
