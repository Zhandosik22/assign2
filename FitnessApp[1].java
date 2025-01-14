
package fitness;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FitnessApp {
    private ArrayList<User> users;

    public FitnessApp() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void displayUserPlans(String userName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                System.out.println("Workout Plans for " + user.getName() + ":");
                for (WorkoutPlan plan : user.getWorkoutPlans()) {
                    System.out.println(plan);
                }
                return;
            }
        }
        System.out.println("User not found.");
    }

    public List<User> filterUsersByAge(int minAge, int maxAge) {
        return users.stream()
                .filter(user -> user.getAge() >= minAge && user.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public void sortUserPlans(String userName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                user.getWorkoutPlans().sort(Comparator.comparing(WorkoutPlan::getPlanName));
                return;
            }
        }
    }
}
