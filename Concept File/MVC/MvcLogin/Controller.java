package MvcLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {
	private View view;
	private Model model;
	
	public Controller()
	{
		
	}
	
	public Controller(View view, Model model)
	{
		this.view = view;
		this.model = model;
	}
	
	public void ConSetUsername(String name)
	{
		
		model.setUsername(name);
	}
	
	public String ConGetUsername()
	{
		return model.getUsername();
	}
	
	public void ConSetPassword(String password)
	{
		model.setPassword(password);
	}
	
	public String ConGetPassword()
	{
		return model.getPassword();
	}
	
	public void checking()
	{
		view.name = model.getUsername();
		view.pass = model.getPassword();
		view.check(view.name, view.pass);
	}

}
