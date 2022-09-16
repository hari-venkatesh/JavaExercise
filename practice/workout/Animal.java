package workout;

public class Animal {
	String type;
	String color;
	int noOfLegs;
	
	public void A(String type) {
		this.type=type;
		System.out.println("a3");
	}
	public void A(String type,String color,int noOfLegs)
	{
		this.type=type;
		this.color=color;
		this.noOfLegs=noOfLegs;
		System.out.println("a1");
	}
	public void A(String type,int noOfLegs)
	{
		this.type=type;
		this.noOfLegs=noOfLegs;
		System.out.println("a2");
	}
}
