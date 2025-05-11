public class ClientProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Zed", "S001", 20000);
        Student student2 = new Student("Akali", "S002", 18000);
        Student student3 = new Student("Shen", "S003", 18000);
        Student student4 = new Student("Kayn", "S004", 18000);

       
        Teacher teacher1 = new Teacher("Prof. Hwei", "Algorithms", 70000);
        Teacher teacher2 = new Teacher("Prof. Erika", "Data Structures", 65000);
        Teacher teacher3 = new Teacher("Prof. Silvestre", "Business Ad", 45000);
        Teacher teacher4 = new Teacher("Prof. Hermana", "Numbers", 55000);

        Department cicsDepartment = new Department("Computer Science");
        cicsDepartment.add(student1);
        cicsDepartment.add(student2);
        cicsDepartment.add(teacher1);
        cicsDepartment.add(teacher2);

        Department coaDepartment = new Department("Auditing");
        coaDepartment.add(student3);
        coaDepartment.add(student4);
        coaDepartment.add(teacher3);
        coaDepartment.add(teacher4);

 
        College businessCollege = new College("College of Business and Computing");
        businessCollege.add(cicsDepartment);
        businessCollege.add(coaDepartment);

  
        System.out.println("\nCollege of Business and Computing");
        businessCollege.displayDetails();
        System.out.println("Total Budget: $" + businessCollege.calculateBudget());
        System.out.println("Total Students: " + businessCollege.getNumberOfStudents());

      
        System.out.println("\nComputer Science Department Teachers");
        cicsDepartment.getTeachers();

        System.out.println("\nAuditing Department Teachers");
        coaDepartment.getTeachers();
    }
}
