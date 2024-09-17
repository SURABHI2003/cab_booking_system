public class Driver {
    String name;
    String username;
    String gender;
    int age;
    String vehicle_model;
    String vehicle_number;
    boolean status;
    Location location;
    double total_earning = 0;

    public Driver(String name, String username, String gender, int age, String vehicle_model, String vehicle_number, boolean status, Location location) {
        this.name = name;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.vehicle_model = vehicle_model;
        this.vehicle_number = vehicle_number;
        this.status = status;
        this.location = location;
        this.total_earning = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getTotal_earning() {
        return total_earning;
    }

    public void setTotal_earning(double total_earning) {
        this.total_earning = total_earning;
    }
}
