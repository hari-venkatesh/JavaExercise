package workout;


public class Adder {

	public static void main(String[] values) {
		float sum = 2;
		for(int i=0;i<values.length;i++)
		{
			sum=sum+Float.parseFloat(values[i]);
		}
		System.out.printf("%.2f",sum);
	}
}
