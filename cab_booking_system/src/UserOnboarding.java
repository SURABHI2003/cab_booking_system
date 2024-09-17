import java.util.HashMap;

public class UserOnboarding {
    HashMap<String, User> userData = new HashMap<>();

    void add_user(String name, String username, String gender, int age, Location location, String conatct_no) {
        User user = new User(name, username, gender, age, location, conatct_no);
        userData.put(username, user);
    }

    void update_user_details(String name, String username, String gender, int age, Location location, String contact_no) {
        User user = userData.get(username);

        user.name = name;
        user.gender = gender;
        user.age = age;
        user.location = location;
        user.contact_no = contact_no;
    }

    void update_user_location(String username, Location location) {
        User user = userData.get(username);

        user.location = location;
    }
}
