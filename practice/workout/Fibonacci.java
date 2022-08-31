package workout;

public class Fibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int first = 0;
		int second = 1;
		System.out.print(first+",");
		System.out.print(second);
		int i = 0;
		while( i<10)
		{
			sum=first+second;
			System.out.print(","+sum);
			first=second;
			second=sum;
			i++;
		}
	}
}
