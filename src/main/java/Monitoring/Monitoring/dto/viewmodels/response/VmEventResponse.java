package Monitoring.Monitoring.dto.viewmodels.response;

import Monitoring.Monitoring.dto.viewmodels.enums.BlWorkType;

import java.time.ZonedDateTime;

public class VmEventResponse {
    private String id;
    private ZonedDateTime date;
    private BlWorkType type;

    public VmEventResponse(String id, ZonedDateTime date, BlWorkType type) {
        this.id = id;
        this.date = date;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public BlWorkType getType() {
        return type;
    }

    public void setType(BlWorkType type) {
        this.type = type;
    }
}
