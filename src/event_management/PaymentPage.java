package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentPage extends JFrame {
	Book_venue bkn;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentPage frame = new PaymentPage();
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
	public PaymentPage(Book_venue bkn) {
		this.bkn=bkn;
		int price;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setBounds(29, 53, 684, 232);
		contentPane.add(textArea);
		
		textArea.append("Name:- "+bkn.user.name+"\n");
		textArea.append("Venue Name:- "+bkn.selected_venue.name+"\n");
		textArea.append("Venue Destination:- "+bkn.selected_venue.address+"\n");
		if(bkn.selected_venue.custom) {
			textArea.append("Customisations :- YES \n");
			textArea.append("Duration :-"+bkn.duration+" days\n");
			textArea.append("Price Breakup :-"+bkn.selected_venue.price*bkn.duration+"(venue)+"+bkn.selected_venue.pack.entertainment.price+
					"("+bkn.selected_venue.pack.entertainment.add_enter+")+"+bkn.selected_venue.pack.theme.price+"("
					+bkn.selected_venue.pack.theme.theme_name+")"+"+500 (customisations)");
			price=bkn.selected_venue.price+bkn.selected_venue.pack.entertainment.price+bkn.selected_venue.pack.theme.price+500;
			textArea.append("\nTotal:- "+price);
		}
		else {
			textArea.append("Customisations :- NO\n");
			textArea.append("Duration :-"+bkn.duration+" days\n");
			textArea.append("Price Breakup :-"+bkn.selected_venue.price*bkn.duration+"(venue)+"+bkn.selected_venue.pack.entertainment.price+
					"("+bkn.selected_venue.pack.entertainment.add_enter+")+"+bkn.selected_venue.pack.theme.price+"("
					+bkn.selected_venue.pack.theme.theme_name+")");
			price=bkn.selected_venue.price+bkn.selected_venue.pack.entertainment.price+bkn.selected_venue.pack.theme.price;

			textArea.append("\nTotal:- "+price);

		}
		
		
		
		
		JLabel lblNewLabel = new JLabel("Booking Preview");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(295, 10, 160, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Payment method");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 312, 202, 13);
		contentPane.add(lblNewLabel_1);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Visa");
		rdbtnNewRadioButton.setBounds(29, 343, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mastercard");
		rdbtnNewRadioButton_1.setBounds(29, 380, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Rupay");
		rdbtnNewRadioButton_2.setBounds(29, 411, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup G = new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnNewRadioButton_1);
		G.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Card number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(228, 314, 97, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(340, 311, 147, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Do Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String method;
				String card_num=textField.getText();
				int len=card_num.length(),flag=0;
				if(len==0) {
					flag=1;
				}
				if(rdbtnNewRadioButton.isSelected() && flag==0) {
					method="visa";
					Payment ptm= new Payment(bkn.selected_venue.venue_id,bkn.user.user_id,method,card_num,bkn,price);
					
					FinalPage frame = new FinalPage(ptm);
					frame.setVisible(true);
					dispose();

				}
				else if (rdbtnNewRadioButton_1.isSelected() && flag==0) {
					method="mastercard";
					Payment ptm= new Payment(bkn.selected_venue.venue_id,bkn.user.user_id,method,card_num,bkn,price);
					FinalPage frame = new FinalPage(ptm);
					frame.setVisible(true);
					dispose();

				}
				else if (rdbtnNewRadioButton_2.isSelected() && flag==0) {
					method="Rupay";
					Payment ptm= new Payment(bkn.selected_venue.venue_id,bkn.user.user_id,method,card_num,bkn,price);
					FinalPage frame = new FinalPage(ptm);
					frame.setVisible(true);
					dispose();

				}
				else {
					JOptionPane.showMessageDialog(null,"please fill the enteries properly");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(228, 361, 153, 21);
		contentPane.add(btnNewButton);
	}
}
