import java.util.ArrayList;
import java.util.List;

public class RideOperation {
    DriverOnboarding onboardDriver;
    List<Driver> availableDrivers = new ArrayList<>();

    public RideOperation(DriverOnboarding onboardDriver) {
        this.onboardDriver = onboardDriver;
    }

    void find_ride(String username, Location source, Location destination) {
        availableDrivers = onboardDriver.get_available_drivers(source);

        if(availableDrivers.size() == 0) {
            System.out.println("No drivers found!");
            return;
        }

        for(Driver driver : availableDrivers) {
            System.out.println("Name: " + driver.name);
            System.out.println("Driver's current location: " + driver.location.x_coordinate + ", " + driver.location.y_coordinate);
            System.out.println();
        }
    }

    void choose_ride(String username, String driverName) {
        onboardDriver.update_driver_status(driverName, false);
    }

    double calculate_bill(String driverName, Location source, Location destination) {
        int source_x = source.x_coordinate;
        int source_y = source.y_coordinate;
        int destination_x = destination.x_coordinate;
        int destination_y = destination.y_coordinate;
        double bill = 0.0;

        bill = Math.sqrt(Math.pow(source_x - destination_x, 2) + Math.pow(source_y - destination_y, 2));

        onboardDriver.update_earning(driverName, bill);

        return bill;
    }

    void find_total_earnings() {
        for(Driver driver : availableDrivers) {
            System.out.println("Name: " + driver.name);
            System.out.println("Earning: " + driver.total_earning);
            System.out.println();
        }
    }
}
