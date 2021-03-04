package event_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddVenueInterface extends JFrame {

	private JPanel contentPane;
	Admin admin;
	private JTextField name_field;
	private JTextField id_field;
	private JTextField address_field;
	private JTextField contact_field;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton back_but;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddVenueInterface frame = new AddVenueInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	private JButton add_venue_but;
	private JLabel lblNewLabel_8;
	private JTextField theme_field;
	private JTextField entertainment_field;
	private JTextField price_theme;
	private JTextField entertainment_price;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;

	/**
	 * Create the frame.
	 */
	public AddVenueInterface(Admin admin) {
		this.admin=admin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(67, 73, 101, 13);
		contentPane.add(lblNewLabel);
		
		name_field = new JTextField();
		name_field.setBounds(206, 70, 96, 19);
		contentPane.add(name_field);
		name_field.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Venue_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(67, 130, 80, 19);
		contentPane.add(lblNewLabel_1);
		
		id_field = new JTextField();
		id_field.setBounds(206, 132, 96, 19);
		contentPane.add(id_field);
		id_field.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(67, 191, 96, 13);
		contentPane.add(lblNewLabel_2);
		
		address_field = new JTextField();
		address_field.setBounds(206, 190, 96, 19);
		contentPane.add(address_field);
		address_field.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contact Num");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(67, 261, 101, 13);
		contentPane.add(lblNewLabel_3);
		
		contact_field = new JTextField();
		contact_field.setBounds(206, 260, 96, 19);
		contentPane.add(contact_field);
		contact_field.setColumns(10);
		
		theme_field = new JTextField();
		theme_field.setBounds(642, 239, 96, 19);
		contentPane.add(theme_field);
		theme_field.setColumns(10);
		
		entertainment_field = new JTextField();
		entertainment_field.setBounds(642, 312, 96, 19);
		contentPane.add(entertainment_field);
		entertainment_field.setColumns(10);
		
		price_theme = new JTextField();
		price_theme.setBounds(754, 239, 49, 19);
		contentPane.add(price_theme);
		price_theme.setColumns(10);
		
		entertainment_price = new JTextField();
		entertainment_price.setBounds(754, 312, 49, 19);
		contentPane.add(entertainment_price);
		entertainment_price.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Add packages here");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(528, 59, 159, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(482, 130, 101, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Add Entertainment");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(482, 313, 126, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Add Theme");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(482, 240, 126, 13);
		contentPane.add(lblNewLabel_7);
		
		add_venue_but = new JButton("Add venue");
		add_venue_but.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Venue Added");
			}
		});
		add_venue_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i,flag=0,alpha=0,beta=0,gamma=0;
				String venue_name=name_field.getText();
				String sid=id_field.getText();
				
				String address=address_field.getText();
				String num=contact_field.getText();
				String theme_name=theme_field.getText();
				String tprice=price_theme.getText();
				String ent_name = entertainment_field.getText();
				String eprice=entertainment_price.getText();
				
				
				
				if(venue_name.length()==0 || address.length()==0 || num.length()==0 || theme_name.length()==0 || ent_name.length()==0 || eprice.length()==0
						|| tprice.length()==0 || sid.length()==0) {
					alpha=1;
				}
				for(i=0;i<num.length();i++) {
					if((num.charAt(i)>='a' && num.charAt(i)<='z')||(num.charAt(i)>='A' && num.charAt(i)<='Z')) {
						flag=1;
						//JOptionPane.showMessageDialog(null, "please enter a correct phone number");
						//break;
					}
				}
				if(num.length()!=10) {
					gamma=1;
				}
				
				if(flag==0 && gamma==0 && alpha==0) {
					int theme_price=Integer.parseInt(tprice);
					int id=Integer.parseInt(sid);
					int ent_price = Integer.parseInt(eprice);
					for(i=0;i<admin.venue_list.size();i++) {
						if(admin.venue_list.get(i).venue_id==id) {
							//beta=1;
							JOptionPane.showMessageDialog(null, "Id exist,please enter a different id");
							break;
						}
					}
					if(i==admin.venue_list.size()) {
					Entertainment ent = new Entertainment(ent_price,ent_name);
					Theme thm= new Theme(theme_price,theme_name);
					Packages pkg = new Packages(id,ent,thm);
					Venue vpn = new Venue(venue_name,id,address,num,pkg,false);
					admin.add_venue(vpn);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Check the enteries again");
				}
				
				
				
			}
		});
		add_venue_but.setBounds(206, 331, 85, 21);
		contentPane.add(add_venue_but);
		
		back_but = new JButton("Back");
		back_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_interface frame = new Admin_interface(admin);
				frame.setVisible(true);
				dispose();
			}
		});
		back_but.setBounds(352, 421, 85, 21);
		contentPane.add(back_but);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(578, 135, 240, 13);
		contentPane.add(lblNewLabel_8);
		
		
		
		lblNewLabel_9 = new JLabel("Price");
		lblNewLabel_9.setBounds(758, 213, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Name");
		lblNewLabel_10.setBounds(642, 216, 45, 13);
		contentPane.add(lblNewLabel_10);
		
	}

}
