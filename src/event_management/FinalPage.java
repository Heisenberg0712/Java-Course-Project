package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalPage extends JFrame {
	Payment ptm;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalPage frame = new FinalPage();
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
	public FinalPage(Payment ptm) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 513);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Congratulations!!! Your Payment is Successfull");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(202, 57, 457, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Receipt");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(56, 132, 129, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(56, 173, 373, 239);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(392, 445, 85, 21);
		contentPane.add(btnNewButton);
		
		textArea.append("Name:- "+ptm.book.user.name+"\n\n");
		textArea.append("Venue Name:- "+ptm.book.selected_venue.name+"\n\n");
		textArea.append("Venue Destination:- "+ptm.book.selected_venue.address+"\n\n");
		textArea.append("Payment mode:- "+ptm.method+"\n\n");
		textArea.append("Payment id :-"+ptm.payment_id+"\n\n");
		textArea.append("USer id :-"+ptm.user_id+"\n\n");
		textArea.append("Final price you paid :-"+ptm.final_price+"\n\n");
	}

}
