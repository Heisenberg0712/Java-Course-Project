package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookWedding extends JFrame {
	Admin ad;
	User us;
	private JPanel contentPane;
	private JTextField venueidfield;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookWedding frame = new BookWedding();
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
	public BookWedding(Admin ad, User us) {
		this.ad=ad;
		this.us=us;
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 483);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Shubh Vivah!!! We provide world class facility to book your special day !!!!!");
		lblNewLabel.setBounds(5, 5, 647, 20);
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Available Venues and Packages");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 63, 315, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(5, 86, 374, 350);
		contentPane.add(textArea);
		for(int i=0;i<ad.venue_list.size();i++) {
			//System.out.println(this.ad.venue_list.get(i).venue_id+"->"+this.ad.venue_list.get(i).name);
			textArea.append(this.ad.venue_list.get(i).venue_id+"->"+this.ad.venue_list.get(i).name+"\n");
			textArea.append("Address==> "+ this.ad.venue_list.get(i).address+"\n");
			textArea.append("With "+this.ad.venue_list.get(i).pack.entertainment.add_enter+" entertainment and "+this.ad.venue_list.get(i).pack.theme.theme_name+" theme\n");
			//System.out.println("	Address "+ this.ad.venue_list.get(i).address);
		}
		
		
		JLabel lblNewLabel_2 = new JLabel("Provide the venue id, you want to book");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(389, 154, 263, 13);
		contentPane.add(lblNewLabel_2);
		
		venueidfield = new JTextField();
		venueidfield.setBounds(467, 177, 96, 19);
		contentPane.add(venueidfield);
		venueidfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Proceed to venue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(venueidfield.getText());
				int i;
				for( i=0;i<ad.venue_list.size();i++) {
					//System.out.println(this.ad.venue_list.get(i).venue_id+"->"+this.ad.venue_list.get(i).name);
					if(id==ad.venue_list.get(i).venue_id) {
						ChosenVenue frame = new ChosenVenue(ad.venue_list.get(i),us);
						//us.booked.add(ad.venue_list.get(i));
						frame.setVisible(true);
						dispose();
						break;
						
					}
					
					//System.out.println("	Address "+ this.ad.venue_list.get(i).address);
				}
				if(i==ad.venue_list.size()) {
				JOptionPane.showMessageDialog(null, "Enter the correct id which is currently present");
				}
				
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(427, 216, 165, 21);
		contentPane.add(btnNewButton);
	}
}
