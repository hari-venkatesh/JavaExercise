package workout;

public class Fibonacci {

	public static void main(String[] args) {
		long sum = 0;
		long first = 0;
		long second = 1;
		System.out.print(first+",");
		System.out.print(second);
		int i = 0;
		while( i<100)
		{
			sum=first+second;
			System.out.print(","+sum);
			first=second;
			second=sum;
			i++;
		}
	}
}
