package Files;

import fmi.informatics.events.Observer;

public class Student extends Person implements Observer {

    private String university;
    private String speciality;
    private int facNumber;

    public Student(String speciality, String university) {
        this.speciality = speciality;
        this.university = university;
    }

    public Student(String name, int egn, String university, String speciality, int facNumber) {
        super(name, egn);
        this.university = university;
        this.speciality = speciality;
        this.facNumber = facNumber;
    }

    public Student(String name, int egn, String university, String speciality, int facNumber,
                   int age, int height, int weight, String gender) {
        super(name, egn, age, height, weight, gender);
        this.university = university;
        this.speciality = speciality;
        this.facNumber = facNumber;
    }

    @Override
    public void update() {

    }
}
