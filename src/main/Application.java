package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));

        List<Student> students = university.getStudents();
        students.get(0).setKnowledge(new Knowledge(5));
        students.get(1).setKnowledge(new Knowledge(4));
        students.get(2).setKnowledge(new Knowledge(2));

        University nulp = new University("NU PL");
        nulp.addStudent(new Student("Stepan Lys", new Knowledge(5)));
        nulp.addStudent(new Student("Petya Pyatochkin", new Knowledge(3)));
        nulp.addStudent(new Student("Ivan Ivaniv", new Knowledge(2)));
        nulp.addStudent(new Student("Petro Petrenko", new Knowledge(4)));

        Internship internship = new Internship("Interlink");
        Internship internship1 = new Internship("Some Internship");

        addIntern(university, internship);
        addIntern(nulp, internship1);

        System.out.println(internship.getName() + " List of internship's students: ");
        System.out.println(internship.getStudents());

        System.out.println(internship.getName() + " List of internship's students:");
        System.out.println(internship1.getStudents());
    }

    static void addIntern(University university, Internship internship) {
        for (Student s : university.getStudents()) {
            if (s.getKnowledge()
                    .getLevel() > university.getGPA()) {
                internship.setStudent(s);
            }
        }
    }
}
