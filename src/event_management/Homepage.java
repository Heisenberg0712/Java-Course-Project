package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Homepage extends JFrame {
	Admin adm;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin ad = new Admin( "Admin","9414475438","admin@gmail.com");
					Entertainment ent = new Entertainment(500,"Folk Dance");
					Theme thm= new Theme(1000,"Dark");
					Packages pkg = new Packages(1,ent,thm);
					Venue vpn = new Venue("Moti Mahal",1,"Rajasthan","123456789",pkg,false);
					Entertainment ent1 = new Entertainment(600,"Western Dance");
					Theme thm1= new Theme(1000,"Light");
					Packages pkg1 = new Packages(1,ent1,thm1);
					Venue vpn1 = new Venue("Virat Palace",2,"Italy","987654321",pkg1,false);
					Entertainment ent2 = new Entertainment(6000,"Plane Show");
					Theme thm2= new Theme(100,"Rock and roll");
					Packages pkg2 = new Packages(1,ent2,thm2);
					Venue vpn2 = new Venue("Lodhi Garden",3,"Delhi","456123789",pkg2,false);
					ad.add_venue(vpn);
					ad.add_venue(vpn1);
					ad.add_venue(vpn2);
					//Admin adm2 = new Admin();
					Homepage frame = new Homepage(ad);
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
	public Homepage(Admin adm) {
		this.adm=adm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Admin login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Admin_login frame = new Admin_login(adm);
					frame.setVisible(true);
					dispose();
				
				
			}
		});
		btnNewButton.setBounds(28, 53, 125, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Book Wedding");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserInterface frame = new UserInterface(adm);
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(233, 53, 137, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Prajapatkartik1\\Desktop\\donnotopen\\java lab\\javapro\\event_management\\src\\mahal.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 10, 411, 284);
		contentPane.add(lblNewLabel);
	}

}
