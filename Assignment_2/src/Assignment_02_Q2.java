import java.util.Scanner;

public class Assignment_02_Q2 {

	public static void main(String[] args) 
	{
		int choice = 0, price = 0;
		double totalBill = 0;
		// TODO Auto-generated method stub
		while(choice!=11)
		{
			Scanner sc =new Scanner(System.in);
			
			System.out.println("------------Menu-------------");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Tea");
			System.out.println("5. Coffee");
			System.out.println("6. Pohe");
			System.out.println("7. Udit Wada");
			System.out.println("8. Uttapa");
			System.out.println("9. Vada Pav");
			System.out.println("10. Generate Bill");
			System.out.println("11. Exit");
			System.out.println("------------------------------");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
						price = 50;
						System.out.println("Dosa coming right up! ");
						totalBill = totalBill + price;
				break;

				case 2:
						price = 20;
						System.out.println("Samosa coming right up! ");
						totalBill = totalBill + price;
				break;
				
				case 3:
						price = 40;
						System.out.println("Idli coming right up! ");
						totalBill = totalBill + price;
				break;

				case 4:
					price = 10;
					System.out.println("Tea coming right up! ");
					totalBill = totalBill + price;
				break;

				case 5:
					price = 20;
					System.out.println("Coffee coming right up! ");
					totalBill = totalBill + price;
				break;

				case 6:
					price = 30;
					System.out.println("Pohe coming right up! ");
					totalBill = totalBill + price;
				break;

				case 7:
					price = 35;
					System.out.println("Udit Wada coming right up! ");
					totalBill = totalBill + price;
				break;

				case 8:
					price = 50;
					System.out.println("Uttapa coming right up! ");
					totalBill = totalBill + price;
				break;

				case 9:
					price = 15;
					System.out.println("Vada Pav coming right up! ");
					totalBill = totalBill + price;
				break;
				
				case 10:
					System.out.println("Your Bill Sir: "+totalBill);
					System.out.println("Please do visit again!!");
					System.out.println("-------------------------------");
				break;

				case 11:
					System.out.println("Your Bill Sir: "+totalBill);
					System.out.println("Please do visit again!!");
					System.out.println("-------------------------------");
					System.exit(0);
				break;

				default:
					System.out.println("Kaka mala vachava!! :)");
			}
		}
	}

}
