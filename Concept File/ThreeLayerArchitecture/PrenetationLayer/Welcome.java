package PrenetationLayer;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BusinessLayer.BL;

public class Welcome extends JFrame {

	BL bl = BL.getobject();
	/**
	 * Create the frame.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VIEW DATA");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(259, 110, 156, 45);
		contentPane.add(btnNewButton);
		
		JButton btnAddMeaning = new JButton("ADD MEANING");
		btnAddMeaning.setForeground(Color.WHITE);
		btnAddMeaning.setBackground(Color.DARK_GRAY);
		btnAddMeaning.setBorderPainted(false);
		btnAddMeaning.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAddMeaning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddMeaning.setBounds(259, 228, 156, 45);
		contentPane.add(btnAddMeaning);
		
		JButton btnImport = new JButton("IMPORT");
		btnImport.setForeground(Color.WHITE);
		btnImport.setBackground(Color.DARK_GRAY);
		btnImport.setBorderPainted(false);
		btnImport.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bl.createDatabase();
					bl.createTable();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				
				if(e.getSource() == btnImport) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setMultiSelectionEnabled(true);
					fileChooser.setCurrentDirectory(new File("C:\\Users\\SOFTAGE\\Desktop"));
					int response = fileChooser.showSaveDialog(null);
					if(response == JFileChooser.APPROVE_OPTION) {
						File file [] = fileChooser.getSelectedFiles();
						try {
							for(int i=0;i<file.length;i++) {
								bl.displayFiles(file[i]);
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}	
				}
				
			}
		});
		btnImport.setBounds(30, 109, 156, 45);
		contentPane.add(btnImport);
		
		JButton btnAddMeaning_2 = new JButton("SEARCH");
		btnAddMeaning_2.setBackground(Color.DARK_GRAY);
		btnAddMeaning_2.setForeground(Color.WHITE);
		btnAddMeaning_2.setBorderPainted(false);
		btnAddMeaning_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnAddMeaning_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Like_View V = new Like_View();
				V.setVisible(true);
				dispose();
			}
		});
		btnAddMeaning_2.setBounds(38, 226, 148, 45);
		contentPane.add(btnAddMeaning_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 447, 294);
		contentPane.add(lblNewLabel);
	}
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}