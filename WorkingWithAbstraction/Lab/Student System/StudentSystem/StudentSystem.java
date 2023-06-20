package Lab.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repository;

    public StudentSystem() {
        this.repository = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repository;
    }

    //ParseCommand -> методи трябва да започват с малка буква
    public void executeCommand(String[] commandParts) {
        String commandName = commandParts[0];

        if (commandName.equals("Create")) {

            createStudent(commandParts);

        } else if (commandName.equals("Show")) {

            showStudent(commandParts[1]);
        }
    }

    private void showStudent(String name) {

        if (repository.containsKey(name)) {
            Student student = repository.get(name);
            StringBuilder output = new StringBuilder(student.toString());

            studentByGrade(student, output);

            System.out.println(output);
        }
    }

    private static void studentByGrade(Student student, StringBuilder output) {
        if (student.getGrade() >= 5.00) {
            output.append(" Excellent student.");
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            output.append(" Average student.");
        } else {
            output.append(" Very nice person.");
        }
    }

    private void createStudent(String[] commandParts) {
        String name = commandParts[1];
        int age = Integer.parseInt(commandParts[2]);
        double grade = Double.parseDouble(commandParts[3]);

        Student student = new Student(name, age, grade);
        repository.putIfAbsent(name, student);
    }
}
