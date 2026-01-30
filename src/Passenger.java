import java.util.ArrayList;

public abstract class Passenger {
    private String name;
    private int passengerNumber;
    public ArrayList<Activity> activitiesSignedUp;
    public ArrayList<Destination> activitiesDestination;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        activitiesSignedUp = new ArrayList<>();
        activitiesDestination = new ArrayList<>();
    }

    public void printDetails() {
        System.out.println("Passenger Name: " + this.name);
        System.out.println("Passenger Number: " + this.passengerNumber);
        if(this instanceof StandardPassenger){
            System.out.println("Balance: " + ((StandardPassenger) this).getBalance());
        }
        else if(this instanceof SeniorPassenger){
            System.out.println("Balance: " + ((SeniorPassenger) this).getBalance());
        }

        System.out.println("Activities Signed Up:");
        if(activitiesSignedUp.isEmpty()){
            System.out.println("  None");
        }
        else{
            for(int i = 0; i < activitiesSignedUp.size(); i++){
                Activity activity = activitiesSignedUp.get(i);
                Destination dest = activitiesDestination.get(i);
                double pricePaid = activity.getCost();
                if(this instanceof SeniorPassenger){
                    pricePaid = activity.getCost() * 0.9;
                }
                else if(this instanceof PremiumPassenger){
                    pricePaid = 0.0;
                }
                System.out.println("  Activity: "+activity.getName()+" at "+dest.getName()+", Price Paid: "+pricePaid);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}