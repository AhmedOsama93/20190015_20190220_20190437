
public class Owner /*extends User*/{
	private Requests requests;
	
	/**
	 * Default Constructor that initializes
	 * the incoming requests of the owner.
	 */
	public Owner() {
		requests = new Requests();
	}
	
	/**
	 * Function that enables the owner to add 
	 * a new playground that he owns.
	 */
	public void registerPlayground()
	{
		Playground pg = new Playground(this);
		
		pg.displayPlaygroundForm();
		
		boolean exists = system.checkPlayground(pg);
		
		if (exists) {
			System.out.println("Sorry, this playground is already registered in our system");
		}
		
		else {
			system.addPlayground(pg);
		
			System.out.println("Your playground is added successfully and waiting for approval");
		}
	}
}
