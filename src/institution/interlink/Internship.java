package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> studentsFromInternship;

    public Internship(String name) {
        //TODO: Implementation is needed
        this.name = name;
        this.studentsFromInternship = new ArrayList<>();
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        studentsFromInternship.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
        String studentName = "";
        for (Student s : studentsFromInternship) {
            studentName += s.getName() + "\n";
        }

        return studentName;
//        return "Andrew Maslenko\nJulia Veselkina\n";
    }

    public String getName() {
        return name;
    }
}
