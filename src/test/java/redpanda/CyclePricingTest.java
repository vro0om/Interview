package redpanda;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CyclePricingTest {

    @Test
    public void calculatedPriceForTripWithStartAndEndTime()
    {
        Trip sampleTrip = new Trip("cycle1", "user1");
        sampleTrip.setStartDateTime(LocalDateTime.now().minusHours(2));
        sampleTrip.setEndDateTime(LocalDateTime.now());
        CyclePricing test = new CyclePricing();
        assertEquals(test.calculateTripCost(sampleTrip), 10d);
    }



}