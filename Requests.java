import java.util.ArrayList;
import java.util.Arrays;
package sample;

/**
 * contain Requests information
 */
public class Requests {
    private Playground[] playgrounds;

    private Integer status[];
    /**
     *  No. of Requests.
     * @param cnt
     */
    private int cnt;
    /**
     *  list of hours of playground
     * @param hours[]
     */
    private String hours[];
    /**
     * default constructor
     * set default values to member variables.
     */
    public Requests()
    {
        cnt = 0;
    }
    /**
     * addRequests add the request of player
     */
    public void addRequest(Playground pg, String from, String to)
    {
        cnt++;

        if (cnt == 1)
        {
            hours = new String[1];

            hours[0] = "From: " + from + " to " + to;

            playgrounds = new Playground[1];

            playgrounds[0] = pg;

            status = new Integer[1];

            status[0] = 0; // Pending Request.
        }
        else {
            ArrayList<String> arr = new ArrayList<String>(Arrays.asList(hours));

            arr.add("From: " + from + " to " + to);

            hours = arr.toArray(hours);

            ArrayList<Playground> arr2 = new ArrayList<Playground>(Arrays.asList(playgrounds));

            arr2.add(pg);

            playgrounds = arr2.toArray(playgrounds);

            ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(status));

            arr3.add(0);

            status = arr3.toArray(status);
        }
    }
}