import java.util.ArrayList;

public class TheatreShow extends Activity {
    private ArrayList<Star> stars;

    public TheatreShow(String name, String description, double cost, int capacity, ArrayList<Star> stars) {
        super(name, description, cost, capacity);
        this.stars = stars;
    }

    public ArrayList<Star> getStars() {
        return stars;
    }

    public void setStars(ArrayList<Star> stars) {
        this.stars = stars;
    }
}
