public class PremiumPassenger extends Passenger{
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }
    public void signUpForActivity(Activity a){
        if(a.getPassengers().size()<a.getCapacity()){
            a.addPassenger(this);
            activitiesSignedUp.add(a);
        }
        else{
            System.out.println("Sorry, this activity is full.");
        }
    }
}
