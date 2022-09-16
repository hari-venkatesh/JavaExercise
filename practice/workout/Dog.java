package workout;

public class Dog extends Animal {
	String name;
	int age;
	
	public void A(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("d1");
	}
	public void A(String type,String color,int noOfLegs,String name,int age)
	{
		this.type=type;
		this.color=color;
		this.noOfLegs=noOfLegs;
		this.name=name;
		this.age=age;
		System.out.println("d2");
	}
}