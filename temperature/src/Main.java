import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature records");
        System.out.println();
        List<TemperatureRecord> records = getRecords(scanner);


        useTemperatureRecords(records);
    }

    private static List<TemperatureRecord> getRecords(Scanner scanner) {
        List<TemperatureRecord> records = new ArrayList<>();

        System.out.println("Do you want to make a temperature record? \n1. Yes\n2. No");
        int decision = scanner.nextInt();
        scanner.nextLine();


        while (decision==1){
            System.out.println();
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            System.out.print("Enter temperature: ");
            String temperatureIn = scanner.nextLine();
            System.out.println();

            double temperature;

            if (temperatureIn.isEmpty()) {
                temperature = Double.parseDouble(null);
            } else {
                // Pasar de string a double
                temperature = Double.parseDouble(temperatureIn);
            }

            TemperatureRecord record = new TemperatureRecord(currentDate, currentTime, temperature);
            records.add(record);

            System.out.println("Do you want to make a other temperature record? \n1. Yes\n2. No");
            decision = scanner.nextInt();
            scanner.nextLine();
        }
        return records;
    }

    private static void useTemperatureRecords(List<TemperatureRecord> records) {
        if (records.isEmpty()) {
            System.out.println("No temperature records provided.");
            return;
        }

        // Se inicializan valores
        TemperatureRecord maxTempRecord = records.get(0);
        TemperatureRecord minTempRecord = records.get(0);
        double totalTemperature = 0;
        int nullTemperature = 0;

        for (TemperatureRecord record : records) {
            if (record.getTemperature() != null) {
                if (record.getTemperature() > maxTempRecord.getTemperature()) {
                    maxTempRecord = record;
                }

                if (record.getTemperature() < minTempRecord.getTemperature()) {
                    minTempRecord = record;
                }

                totalTemperature += record.getTemperature();
            } else {
                nullTemperature++;
            }
        }



        double meanTemperature = totalTemperature / (records.size() - nullTemperature);

        System.out.println();
        System.out.println("Report: ");
        System.out.println();
        System.out.println("Date with highest temperature: " + maxTempRecord.getDate());
        System.out.println("Time with highest temperature: " + maxTempRecord.getTime());
        System.out.println("Date with lowest temperature: " + minTempRecord.getDate());
        System.out.println("Time with lowest temperature: " + minTempRecord.getTime());

        System.out.println("Mean temperature: " + meanTemperature);
        System.out.println("Total records with null temperature: " + nullTemperature);
        System.out.println();
    }
}