package MvcLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JButton btnNewButton;
	private JTextField Password;
	public String name, pass;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	
	public void check(String name, String pass) {
		if(Name.getText().equals(name) && Password.getText().equals(pass))
		{
			label1.setText("Login....");
		}
		else
		{
			label1.setText("Incorrect...");
		}
	}
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 11, 54, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblPassword.setBounds(10, 62, 97, 27);
		contentPane.add(lblPassword);
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Name.setBounds(101, 8, 126, 26);
		contentPane.add(Name);
		Name.setColumns(10);
		
		Password = new JTextField();
		Password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Password.setColumns(10);
		Password.setBounds(101, 59, 126, 26);
		contentPane.add(Password);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(name, pass);
			}
		});
		btnNewButton.setBounds(69, 100, 89, 23);
		contentPane.add(btnNewButton);
		
		label1 = new JLabel("Enter Info to login");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label1.setBounds(23, 137, 148, 23);
		contentPane.add(label1);
	}
}
