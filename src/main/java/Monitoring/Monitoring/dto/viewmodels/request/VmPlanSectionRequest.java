package Monitoring.Monitoring.dto.viewmodels.request;

import org.springframework.lang.Nullable;

import java.util.Calendar;

public class VmPlanSectionRequest {
    @Nullable
    private Calendar startDate;
    @Nullable
    private Calendar finishDate;

    public VmPlanSectionRequest(@Nullable Calendar startDate, @Nullable Calendar finishDate) {
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Nullable
    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(@Nullable Calendar startDate) {
        this.startDate = startDate;
    }

    @Nullable
    public Calendar getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(@Nullable Calendar finishDate) {
        this.finishDate = finishDate;
    }
}