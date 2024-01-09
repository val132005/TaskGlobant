import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface TemperatureReportConverter {

    // El metodo retornara una lista de objetos de tipo TemperatureRecord
    List<TemperatureRecord> convertToCelsiusRecord(Collection<TemperatureRecord> recordFahrenheit);
}

