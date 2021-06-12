import java.util.Scanner;

public class Booking {
    /**
     * function withdraw take money from the balance and add money to the balance.
     * @param p determine the player who book playground
     * @param pg determine the playground that the player want to book
     * @param from determine the start time
     * @param to determine the finish time
     */
    public void book(Player p, Playground pg, String from, String to){
        p.requests.addRequest(pg, from, to);

        System.out.println("Your booking is done and now your request is pending");
    }

    /**
     * function displayPlayground display all playgrounds
     * @return the playgrounds info
     */
    public void displayPlayground(){
        Playground playgrounds[] = system.getPlaygrounds();

        for (int i = 0; i < system.cntPlaygrounds; i++) {
            System.out.println(i + 1 + ".");

            playgrounds[i].displayInfo();
        }
    }
}