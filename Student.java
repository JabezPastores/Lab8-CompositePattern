public class Student implements OrgComponent {
    private String name;
    private String studentId;
    private double tuition;

    public Student(String name, String studentId, double tuition) {
        this.name = name;
        this.studentId = studentId;
        this.tuition = tuition;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student's Name: " + this.name);
        System.out.println("ID: " + this.studentId);
        System.out.println("Student Tuition: " + calculateBudget());
    }

    @Override
    public void getTeachers() {
        // Student is not a teacher
    }

    @Override
    public double calculateBudget() {
        return -this.tuition;
    }

    @Override
    public int getNumberOfStudents() {
        return 1; 
    }
}