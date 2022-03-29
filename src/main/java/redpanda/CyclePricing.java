package redpanda;

import java.time.temporal.ChronoUnit;


public class CyclePricing {

    public static double PER_HOUR_RATE = 5d;

    public double calculateTripCost(Trip sampleTrip) {
        long tripHours = ChronoUnit.HOURS.between( sampleTrip.getStartDateTime(),sampleTrip.getEndDateTime());
        return tripHours * PER_HOUR_RATE;
    }
}
