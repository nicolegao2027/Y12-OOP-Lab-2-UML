public class WalkingTour extends Activity {
    private double distance;

    public WalkingTour(String name, String description, double cost, int capacity, double distance) {
        super(name, description, cost, capacity);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
