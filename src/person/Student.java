package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        //TODO: Implementation is needed
        this.name = name;
    }

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }

}
