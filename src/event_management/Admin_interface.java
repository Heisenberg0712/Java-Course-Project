package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Admin_interface extends JFrame {

	private JPanel contentPane;
	Admin admin;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_interface frame = new Admin_interface();
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
	public Admin_interface(Admin admin) {
		this.admin=admin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Prajapatkartik1\\Downloads\\Screenshot_2021-03-02 Welcome admin - Google Search(1).png"));
		lblNewLabel_1.setBounds(20, 31, 790, 242);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome "+ this.admin.name);
		lblNewLabel.setBounds(362, 10, 117, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add venues");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddVenueInterface frame = new AddVenueInterface(admin);
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(93, 328, 117, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Venues");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Showvenue frame = new Showvenue(admin);
				frame.setVisible(true);
				
			}
			
		});
		/*btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"See Console window");
			}
		});*/
		
		btnNewButton_1.setBounds(333, 328, 117, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("remove venues");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveVenuesInterface frame = new RemoveVenuesInterface(admin);
				frame.setVisible(true);
				Showvenue frame1 = new Showvenue(admin);
				frame1.setVisible(true);
				//dispose();
			}
		});
		btnNewButton_2.setBounds(587, 328, 146, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Go to homepage");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage(admin);
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(314, 401, 165, 21);
		contentPane.add(btnNewButton_3);
	}

}
