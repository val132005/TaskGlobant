import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class TemperatureRecord {

    private LocalDate date;
    private LocalTime time;
    private Double temperature;

    public TemperatureRecord(LocalDate date, LocalTime time, Double temperature) {
        this.date = date;
        this.time = time;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }



}
