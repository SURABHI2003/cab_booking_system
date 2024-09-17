import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DriverOnboarding {
    HashMap<String, Driver> driverData = new HashMap<>();

    void add_driver(String name, String username, String gender, int age, String vehicle_model, String vehicle_number, boolean status, Location location) {
        Driver driver = new Driver(name, username, gender, age, vehicle_model, vehicle_number, status, location);

        driverData.put(username, driver);
    }

    void update_driver_details(String name, String username, String gender, int age, String vehicle_model, String vehicle_number, boolean status, Location location) {
        Driver driver = driverData.get(username);

        driver.name = name;
        driver.gender = gender;
        driver.age = age;
        driver.location = location;
        driver.vehicle_model = vehicle_model;
        driver.vehicle_number = vehicle_number;
        driver.status = status;
    }

    void update_driver_status(String username, boolean status) {
        Driver driver = driverData.get(username);

        driver.status = status;
    }

    List<Driver> get_available_drivers(Location source) {
        List<Driver> available_drivers = new ArrayList<>();

        for(String username : driverData.keySet()) {
            Driver driver = driverData.get(username);
            if(!driver.status) continue;

            int source_x = source.x_coordinate;
            int source_y = source.y_coordinate;
            int current_x = driver.location.x_coordinate;
            int current_y = driver.location.y_coordinate;
            double dist;

            dist = Math.sqrt(Math.pow(source_x - current_x, 2) + Math.pow(source_y - current_y, 2));

            if(dist <= 5.0) {
                available_drivers.add(driver);
            }
        }

        return available_drivers;
    }

    void update_earning(String username, double earning) {
        Driver driver = driverData.get(username);

        driver.total_earning += earning;
    }
}
