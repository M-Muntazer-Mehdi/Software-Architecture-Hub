package AWT;

import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;


public class Awt_login extends Frame implements ActionListener {

		
		Label label1, label2, label3;
		TextField txt1, txt2;
		Button btn1;
		
		public Awt_login()
		{
			label1 = new Label("Enter Name");
			label2 = new Label("Enter Password");
			label3 = new Label("Please Login");
			
			txt1 = new TextField(10);
			txt2 = new TextField(10);
			
			btn1 = new Button("Login");
			
			
			this.add(label1);
			this.add(txt1);
			this.add(label2);
			this.add(txt2);
			this.add(btn1);
			this.add(label3);
			
			
			this.setSize(200, 200);
			this.setTitle("Login");
			this.setLayout(new FlowLayout());
			
			
			
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
		
	
	        btn1.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		     if(txt1.getText().equals("Muntazer") || txt2.getText().equals(1234))
		     {
			     label3.setText("Login....");
		     }
		     else
		     {
		    	 label3.setText("Incorrect....");
		     }
		     }});
		}
	public static void main (String [] args)
	{
		Awt_login calc = new Awt_login();
		calc.setVisible(true);
		calc.setSize(150,230);
		calc.setLocation(150, 250);
	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
