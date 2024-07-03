package MvcLogin;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		View view = new View();
		view.setVisible(true);
		Model model = new Model();
		Controller controller = new Controller(view, model);
		controller.ConSetUsername("Muntazer");
		controller.ConSetPassword("1234");
		
		controller.checking();

	}

}
