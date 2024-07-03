package Interfaces;

interface classA{
	void car();
};

interface classB extends classA{
	void electric();
};

interface classC extends classA{
	void gasoline();
};

interface classD extends classB, classC{
	void hybrid();
};

class main implements classD{
	public void hybrid()
	{
		System.out.print("\nclassD is child of classB & classC\n");
		System.out.print("Means classD is Electric & gasonline\n");
		System.out.print("classD is Hybrid\n");
	}
	public void gasoline()
	{
		System.out.print("\nclassC is child of classA\n");
		System.out.print("Means classC is gasonline\n");
		System.out.print("classC is Gasonline car\n");
	}
	public void electric()
	{
		System.out.print("\nclassB is child of classA\n");
		System.out.print("Means classB is Electric\n");
		System.out.print("classB is Electric car\n");
	}
	public void car()
	{
		System.out.print("\nclassA is Base class\n");
		System.out.print("Means it is a car\n");
	}
};

public class Interface_Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main m = new main();
		m.car();
		m.electric();
		m.gasoline();
		m.hybrid();
	}

}
