package redpanda;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TripServiceTest {

    @Test
    public void startTrip_StartDateTimeIsRecorded()
    {
        Trip sampleTrip = new Trip("cycle1", "user1");
        TripService testService = new TripService();

        Trip startedTrip = testService.startTrip(sampleTrip);

        assertEquals(startedTrip.getTripId(),sampleTrip.getTripId());
        assertNotNull(startedTrip.getStartDateTime());
    }

    @Test
    public void endTrip_EndDateTimeIsRecorded()
    {
        Trip sampleTrip = new Trip("cycle1", "user1");
        sampleTrip.setStartDateTime(LocalDateTime.now());
        TripService testService = new TripService();

        Trip startedTrip = testService.endTrip(sampleTrip);

        assertEquals(startedTrip.getTripId(),sampleTrip.getTripId());
        assertNotNull(startedTrip.getEndDateTime());
    }

}
