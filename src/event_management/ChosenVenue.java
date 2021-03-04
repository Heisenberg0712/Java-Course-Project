package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChosenVenue extends JFrame {
	Venue vpn;
	User us;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChosenVenue frame = new ChosenVenue();
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
	public ChosenVenue(Venue vpn,User us) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 528);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to "+vpn.name);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(280, 10, 233, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customise Theme");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(47, 72, 160, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customise Entertainment");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(244, 72, 210, 13);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bollywood");
		rdbtnNewRadioButton.setBounds(47, 157, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tropical Fiesta");
		rdbtnNewRadioButton_1.setBounds(47, 208, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Gardenia");
		rdbtnNewRadioButton_2.setBounds(47, 268, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Floral");
		rdbtnNewRadioButton_3.setBounds(47, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		ButtonGroup G = new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnNewRadioButton_1);
		G.add(rdbtnNewRadioButton_2);
		G.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Fireworks");
		rdbtnNewRadioButton_4.setBounds(253, 157, 103, 21);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Table Trivia");
		rdbtnNewRadioButton_5.setBounds(253, 208, 103, 21);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Wedding Dj");
		rdbtnNewRadioButton_6.setBounds(253, 268, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Live Bands");
		rdbtnNewRadioButton_7.setBounds(253, 329, 103, 21);
		contentPane.add(rdbtnNewRadioButton_7);
		ButtonGroup G1 = new ButtonGroup();
		G1.add(rdbtnNewRadioButton_7);
		G1.add(rdbtnNewRadioButton_6);
		G1.add(rdbtnNewRadioButton_5);
		G1.add(rdbtnNewRadioButton_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 17));
		spinner.setBounds(485, 393, 30, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Days");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(536, 393, 45, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("For");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(443, 398, 54, 13);
		contentPane.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(362, 155, 450, 207);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Theme thm1 ;
				Entertainment etm1;
				boolean x;
				if(rdbtnNewRadioButton.isSelected()) {
					Theme thm = new Theme(2000,"Bollywood");
					thm1=thm;
					x=true;
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
					Theme thm = new Theme(2500,"Tropical Fiesta");
					thm1=thm;
					x=true;
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
					Theme thm = new Theme(3000,"Gardenia");
					thm1=thm;
					x=true;
				}
				else if(rdbtnNewRadioButton_3.isSelected()) {
					Theme thm = new Theme(3500,"Floral");
					thm1=thm;
					x=true;
				}
				else {
					x=false;
					thm1=vpn.pack.theme;
				}
				if(rdbtnNewRadioButton_4.isSelected()) {
					Entertainment etm = new Entertainment(5000,"Fireworks");
					etm1=etm;
					x=true;
				}
				else if(rdbtnNewRadioButton_5.isSelected()) {
					Entertainment etm = new Entertainment(5500,"Table Trivia");
					etm1=etm;
					x=true;
				}
				else if(rdbtnNewRadioButton_6.isSelected()) {
					Entertainment etm = new Entertainment(6000,"Wedding Dj");
					etm1=etm;
					x=true;
				}
				else if(rdbtnNewRadioButton_7.isSelected()) {
					Entertainment etm = new Entertainment(6500,"Live Bands");
					etm1=etm;
					x=true;
				}
				else {
					x=false;
					etm1=vpn.pack.entertainment;
				}
				Packages pkm2= new Packages(vpn.venue_id,etm1,thm1);
				Venue vpn2 = new Venue(vpn.name,vpn.venue_id,vpn.address,vpn.contact_num,pkm2,x);
				int bid = (int)Math.random()*(9999-1000+1)*1000;
				int dur = (int) spinner.getValue();
				if(dur<2) {
					JOptionPane.showMessageDialog(null, "Minimum booking days should be 2");
				}
				else if(dur>7) {
					JOptionPane.showMessageDialog(null, "As of now, we are only providing bookings for maximum 7 days");
				}
				else {
				Book_venue bkn = new Book_venue(bid,us.user_id,vpn2,dur,us);
				PaymentPage frame = new PaymentPage(bkn);
				frame.setVisible(true);
				dispose();
			}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(298, 460, 233, 21);
		contentPane.add(btnNewButton);
		
		textArea.append("Hello "+us.name+", Thank you for choosing "+ vpn.address+ " as your wedding destination.\n\n");
		textArea.append("Your Currently selected venue has following themes \n\n");
		textArea.append(vpn.pack.entertainment.add_enter+" as entertainment\n\n");
		textArea.append(vpn.pack.theme.theme_name+" as theme\n\n");
		textArea.append("If you want to customise these theme and entertainment selections, then we have some \nmore fresh ideas,exclusively for you\n\n");
		textArea.append("Feel free to customise");
		
		
	}
}
