//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserOnboarding onboardUser = new UserOnboarding();
        DriverOnboarding onboardDriver = new DriverOnboarding();
        RideOperation rideOperation = new RideOperation(onboardDriver);

        onboardUser.add_user("Abhay", "Abhay", "M", 23, null, "9876767676");
        onboardUser.update_user_location("Abhay", new Location(0, 0));

        onboardUser.add_user("Vikram", "Vikram", "M", 29, null, "9876867676");
        onboardUser.update_user_location("Abhay", new Location(10, 0));

        onboardUser.add_user("Kriti", "Kriti", "F", 43, null, "9876767676");
        onboardUser.update_user_location("Abhay", new Location(15, 6));

        onboardDriver.add_driver("d1", "d1", "M", 22, "Swift", "KA-01-12345", true, new Location(10, 1));
        onboardDriver.add_driver("d2", "d2", "M", 72, "Swift", "KA-01-16345", true, new Location(11, 10));
        onboardDriver.add_driver("d3", "d3", "M", 32, "Swift", "KA-01-12355", true, new Location(5, 3));

        rideOperation.find_ride("Abhay", new Location(0, 0), new Location(20, 1));
        rideOperation.find_ride("Vikram", new Location(10, 0), new Location(15, 3));

        rideOperation.choose_ride("Vikram", "d1");
        rideOperation.calculate_bill("d1", new Location(10, 0), new Location(15, 3));

        rideOperation.find_ride("Kriti", new Location(15, 6), new Location(20, 4));

        rideOperation.find_total_earnings();
    }
}