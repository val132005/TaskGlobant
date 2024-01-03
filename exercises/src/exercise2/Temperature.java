package exercise2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Temperature {

    private LocalDate date;
    private LocalTime time;
    private double temperatureFahrenheit;
    private static List<Temperature> temperatureRecord = new ArrayList<>();
    private static List<Temperature> convertedRecords = new ArrayList<>();




    public Temperature(LocalDate date, LocalTime time, double temperatureFahrenheit){
        this.date = date;
        this.time = time;
        this.temperatureFahrenheit = temperatureFahrenheit;

    }


    public LocalDate gerCurrentDate(){
        return LocalDate.now();
    }

    public LocalTime getCurrentTime(){
        return LocalTime.now();
    }

    public void addRecord(LocalDate date, LocalTime time, double temperatureFahrenheit){
        Temperature temperature = new Temperature(date, time, temperatureFahrenheit);
        temperatureRecord.add(temperature);
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

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }




}
