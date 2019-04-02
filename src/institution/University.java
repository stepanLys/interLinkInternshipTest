package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> students;
    private Student student;

    public University(String name) {
        //TODO: Implementation is needed
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        this.student = student;
    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getGPA() {
        return students
                .stream()
                .mapToDouble(item -> item.getKnowledge().getLevel())
                    .sum() / students.size();
    }

}
