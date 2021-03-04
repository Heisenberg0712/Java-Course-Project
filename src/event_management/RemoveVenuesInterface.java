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

public class RemoveVenuesInterface extends JFrame {

	private JPanel contentPane;
	Admin admin;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveVenuesInterface frame = new RemoveVenuesInterface();
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
	public RemoveVenuesInterface(Admin admin) {
		this.admin=admin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the id to be deleted");
		lblNewLabel.setBounds(50, 39, 142, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(220, 36, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				int id=0;
				if(str.length()==0) {
					JOptionPane.showMessageDialog(null, "enter a value");
				}
				else {
					id = Integer.parseInt(str);
					int i = admin.remove(id);
					if(i==1) {
						JOptionPane.showMessageDialog(null, "Deleted");
					}
					else {
						JOptionPane.showMessageDialog(null,"cant find");
					}
				}
				
			}
		});
		/*int id = Integer.parseInt(textField.getText());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(admin.remove(id)==1) {
					JOptionPane.showMessageDialog(null, "Successfully deleted !!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Cannot find the provided id, Check again !!");
				}
			}
		});*/
		btnNewButton.setBounds(131, 97, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(248, 97, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
	}

}
