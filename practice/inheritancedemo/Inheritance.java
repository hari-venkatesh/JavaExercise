package inheritancedemo;

public class Inheritance {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Snake();
		Animal a4 = new Dog();
		Animal a5 = new Cat();
		Animal a6 = new Snake();
		a1.A("Tommy",5);
		a2.A("kitty",4);
		a3.A("Raja");
		a4.A("Dog","Black",4);
		a5.A("Mizz","White",4);
		a6.A("Naga","Brown",8);
	}
}
