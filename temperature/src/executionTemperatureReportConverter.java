import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class executionTemperatureReportConverter implements TemperatureReportConverter {

    @Override
    public List<TemperatureRecord> convertToCelsiusRecord(Collection<TemperatureRecord> recordFahrenheit) {
        List<TemperatureRecord> celsiusRecords = new ArrayList<>();

        for (TemperatureRecord record : recordFahrenheit) {
            if (record.getTemperature() != null) {
                double celsiusTemperature = (record.getTemperature() - 32) / 1.8;
                TemperatureRecord celsiusRecord = new TemperatureRecord(record.getDate(), record.getTime(), celsiusTemperature);
                celsiusRecords.add(celsiusRecord);
            }
        }

        return celsiusRecords;
    }


}
