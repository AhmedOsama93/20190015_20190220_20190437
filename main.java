import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		system.cntPlaygrounds = 0;
		
		system.cntUsers = 0;
		
		while(true)
		{
			System.out.println("1- Register a user");
			
			System.out.println("2- Adding a playground and its available times and price");
			
			System.out.println("3- Booking a time slot on the playground");
			
			System.out.println("4- Exit");
			
			Scanner in = new Scanner(System.in);
			
			int choice = in.nextInt();
			
			if (choice == 1)
			{
				UserInterface ui = new UserInterface();
				
				ui.signup();
			}
			
			else if (choice == 2)
			{
				Owner o = new Owner();
				
				o.registerPlayground();
			}
			
			else if (choice == 3)
			{
				Player p = new Player();
			
				p.bookPlayground();
			}
			
			else {
				break;
			}
		}
	}

}
