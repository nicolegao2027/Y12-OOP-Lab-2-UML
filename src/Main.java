import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a cruise ship
        CruiseShip cruiseShip = new CruiseShip("Ship1", 100);

        // Create destinations
        Destination paris = new Destination("Paris");
        Destination rome = new Destination("Rome");
        Destination barcelona = new Destination("Barcelona");

        // Create activities for Paris
        VisitAttraction eiffelTower = new VisitAttraction("Eiffel Tower Visit", "Visit the iconic Eiffel Tower with guide", 50, 30);
        WalkingTour parisWalkingTour = new WalkingTour("Paris Walking Tour", "Explore the historic streets of Paris", 25.5, 20, 5.5);

        // Create activities for Rome
        VisitAttraction colosseum = new VisitAttraction("Colosseum Visit", "Tour the ancient Roman Colosseum", 45, 25);
        Star MaleLead = new Star("John Smith", "Romeo");
        Star FemaleLead = new Star("Mary Smith", "Juliet");
        ArrayList <Star> stars = new ArrayList<>();
        stars.add(MaleLead);
        stars.add(FemaleLead);
        TheatreShow romeTheatre = new TheatreShow("Roman Theatre Show", "Experience classical Roman theatre", 60.0, 15, stars);

        // Create activities for Barcelona
        WalkingTour barcelonaTour = new WalkingTour("Barcelona Architecture Tour", "Explore the historic streets of Paris", 30.0, 18, 4.0);

        // Add activities to destinations
        paris.addActivity(eiffelTower);
        paris.addActivity(parisWalkingTour);
        rome.addActivity(colosseum);
        rome.addActivity(romeTheatre);
        barcelona.addActivity(barcelonaTour);

        // Add destinations to cruise ship itinerary
        cruiseShip.addDestination(paris);
        cruiseShip.addDestination(rome);
        cruiseShip.addDestination(barcelona);

        // Create passengers
        StandardPassenger passenger1 = new StandardPassenger("Alice Johnson", 1, 200);
        SeniorPassenger passenger2 = new SeniorPassenger("Bob Smith", 2, 150);
        PremiumPassenger passenger3 = new PremiumPassenger("Charlie Brown", 3);
        StandardPassenger passenger4 = new StandardPassenger("Diana Jones", 4, 100);

        // Add passengers to cruise ship
        cruiseShip.addPassenger(passenger1);
        cruiseShip.addPassenger(passenger2);
        cruiseShip.addPassenger(passenger3);
        cruiseShip.addPassenger(passenger4);

        // Alice signs up for Eiffel Tower (standard passenger, full price)
        passenger1.signUpForActivity(eiffelTower);

        // Bob signs up for Colosseum (senior passenger, 10% discount)
        passenger2.signUpForActivity(colosseum);

        // Charlie signs up for multiple activities (premium passenger, free)
        passenger3.signUpForActivity(eiffelTower);

        passenger3.signUpForActivity(romeTheatre);

        // Diana tries to sign up for an activity but doesn't have enough balance
        passenger4.signUpForActivity(eiffelTower);

        // Diana signs up for a cheaper activity
        passenger4.signUpForActivity(parisWalkingTour);

        // Print itinerary
        cruiseShip.printItinerary();

        // Print passenger list
        cruiseShip.printPassengerList();

        // Print individual passenger details
        passenger1.printDetails();
        passenger2.printDetails();
        passenger3.printDetails();

        // Print available activities
        cruiseShip.printAvailableActivities();
    }
}