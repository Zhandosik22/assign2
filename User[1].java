
package fitness;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<WorkoutPlan> workoutPlans;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.workoutPlans = new ArrayList<>();
    }

    public void addWorkoutPlan(WorkoutPlan workoutPlan) {
        workoutPlans.add(workoutPlan);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + '}';
    }
}
