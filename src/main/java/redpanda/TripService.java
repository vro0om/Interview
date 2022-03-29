package redpanda;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;

public class TripService {

    public Trip startTrip(Trip trip){
        trip.setStartDateTime(LocalDateTime.now());
        return trip;
    }

    public Trip endTrip(Trip trip) {
        trip.setEndDateTime(LocalDateTime.now());
        return trip;
    }
}
