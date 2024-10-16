import java.util.Scanner;

public class Assignment_1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 0; 
		double n2 = 0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		System.out.println("Enter two Numbers: ");
		
		if(sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.println("Double numbers only!!");
			}
			else
			{
	
				double answer = (n1 + n2)/2;
				System.out.println(answer);
			}
		}		
	}
}
