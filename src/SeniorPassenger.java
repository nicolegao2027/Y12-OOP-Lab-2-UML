public class SeniorPassenger extends Passenger{
    private double balance;

    public SeniorPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }
    public void signUpForActivity(Activity a, Destination d){
        if(a.getCost()*0.9<this.balance) {
            if(a.getPassengers().size() < a.getCapacity()){
                a.addPassenger(this);
                activitiesSignedUp.add(a);
                balance -= a.getCost()*0.9;
                activitiesDestination.add(d);
            }
            else{
                System.out.println("Sorry, this activity is full.");
            }
        }
        else{
            System.out.println("Sorry, this activity is too expensive for you");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
