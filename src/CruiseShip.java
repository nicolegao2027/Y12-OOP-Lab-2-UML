import java.util.ArrayList;

public class CruiseShip {
    private String name;
    private int passengerCapacity;
    private ArrayList<Destination> itinerary;
    private ArrayList<Passenger> passengers;

    public CruiseShip(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination d){
        itinerary.add(d);
    }

    public void addPassenger(Passenger p){
        if(passengers.size()<this.passengerCapacity) {
            passengers.add(p);
        }
        else{
            System.out.println("Sorry, the Cruise Ship is full.");
        }
    }

    public void printItinerary() {
        System.out.println("Cruise Ship: " + this.name);
        System.out.println("Itinerary:");
        for(Destination dest:itinerary){
            System.out.println("\nDestination: " + dest.getName());
            for(Activity activity:dest.getActivities()){
                System.out.print("  Activity: "+activity.getName()+", Cost: "+activity.getCost()+", Capacity: "+activity.getCapacity());
                if(activity instanceof WalkingTour){
                    WalkingTour wt=(WalkingTour) activity;
                    System.out.print(", Distance: "+wt.getDistance()+" km");
                }
                if(activity instanceof TheatreShow){
                    TheatreShow ts=(TheatreShow) activity;
                    System.out.print(", Stars: ");
                    for(int i=0; i<ts.getStars().size(); i++){
                        System.out.print(ts.getStars().get(i).toString());
                        if(i<ts.getStars().size()- 1){
                            System.out.print(", ");
                        }
                    }
                }

                System.out.println();
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Cruise Ship: "+this.name);
        System.out.println("Passenger Capacity: "+this.passengerCapacity);
        System.out.println("Number of Passengers: "+this.passengers.size());
        System.out.println("Passengers:");
        for(Passenger p : passengers){
            System.out.println("  "+p.getName()+" (Number: "+p.getPassengerNumber()+")");
        }
    }

    public void printAvailableActivities() {
        System.out.println("Activities with Available Spaces:");
        boolean found = false;

        for(Destination dest:itinerary){
            for(Activity activity:dest.getActivities()){
                int availableSpaces=activity.getCapacity() - activity.getPassengers().size();
                if(availableSpaces > 0){
                    found=true;
                    System.out.println("  "+activity.getName()+" at " + dest.getName()+" - "+availableSpaces+" spaces available");
                }
            }
        }

        if(!found){
            System.out.println("  No activities.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
