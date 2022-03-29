package redpanda;

import java.time.LocalDateTime;
import java.util.Date;

public class Trip {
    private String tripId;
    private String cycleId;
    private String userId;

    private LocalDateTime  startDateTime;
    private LocalDateTime endDateTime;

    public Trip(String cycleId, String userId) {
        this.cycleId = cycleId;
        this.userId = userId;
    }

    public String getCycleId() {
        return cycleId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTripId() {
        return tripId;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
}
