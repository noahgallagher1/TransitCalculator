import java.lang.Math;
public class basicFare {
    int numDays;
    int numPeople;
    String[] options = {"Pay-per-ride","7-day Unlimited Rides", "30-day Unlimited Rides"};
    double[] prices = {2.75,33.00,127.00};

    public basicFare(int days,int rides){
        this.numDays = days;
        this.numPeople = rides;
    }

    public double unlimited7Price(){
        double numPasses = Math.ceil(numDays / 7.0);
        double totalCost = numPasses * 33;
        double pricePerRide = totalCost / numPeople;
        return pricePerRide;
    }



    public double[] getRidePrices(){
        double thirtyDay = (127/numPeople);
        //double 7price = unlimited7Price();

        double[] eachFare = {2.75,unlimited7Price(),thirtyDay};
        return eachFare;
    }


    public String getBestFare(){
        double[] allRides = getRidePrices();
        double low = 100.00;
        int lowIndex = 0;
        for (int i = 0; i < 2;i++){
            if (allRides[i] < allRides[lowIndex]){
                lowIndex = i;

            }}
        return "You should get the " + options[lowIndex] + " option at $" + allRides[lowIndex] + " per ride.";
    }



    public static void main(String[] args){


        basicFare nyc = new basicFare(129,2278);
        System.out.println(nyc.getBestFare());

    }

}
