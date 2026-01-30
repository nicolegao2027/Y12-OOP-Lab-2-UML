public class StandardPassenger extends Passenger{
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    public void signUpForActivity(Activity a){
        if(a.getCost()<this.balance) {
            if (a.getPassengers().size() < a.getCapacity()) {
                a.addPassenger(this);
                activitiesSignedUp.add(a);
                balance -= a.getCost();
            } else {
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
