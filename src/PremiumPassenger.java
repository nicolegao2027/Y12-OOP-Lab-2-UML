public class PremiumPassenger extends Passenger{
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }
    public void signUpForActivity(Activity a, Destination d){
        if(a.getPassengers().size()<a.getCapacity()){
            a.addPassenger(this);
            activitiesSignedUp.add(a);
            activitiesDestination.add(d);
        }
        else{
            System.out.println("Sorry, this activity is full.");
        }
    }
}
