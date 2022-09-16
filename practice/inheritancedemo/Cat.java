package inheritancedemo;

public class Cat extends Animal {
	String name;
	int age;
	
	public void A(String type,String color,int noOfLegs,String name)
	{
		this.type=type;
		this.color=color;
		this.noOfLegs=noOfLegs;
		this.name=name;
		System.out.println("c2");
	}
}
