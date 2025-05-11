import java.util.ArrayList;
import java.util.List;

public class Department implements OrgComponent {
    private String name;
    private List<OrgComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrgComponent component) {
        components.add(component);
    }

    public void remove(OrgComponent component) {
        components.remove(component);
    }

    public List<OrgComponent> getChildren() {
        return components;
    }

    public void getTeachers() {
        System.out.println("List of Teachers: ");
        for (OrgComponent component : components) {
            if (component instanceof Teacher) {
                component.displayDetails();
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Department Name: " + this.name);
        System.out.println("Number of Students: " + getNumberOfStudents());
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (OrgComponent component : components) {
            budget += component.calculateBudget();
        }
        return budget;
    }

    @Override
    public int getNumberOfStudents() {
        int noOfStudents = 0;
        for (OrgComponent component : components) {
            noOfStudents += component.getNumberOfStudents();
        }
        return noOfStudents;
    }
}