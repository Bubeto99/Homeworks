import java.util.ArrayList;
import java.util.List;

public class PeopleRepository {
    private List<Person> people = new ArrayList<>();


    public void addProfessor(int studyPoints){
        var person = PeopleMaker.createPerson("Professor");
    }

    public void addStudent(int studyPoints){
        var person = PeopleMaker.createPerson("Student");
    }

    public void addRichStudent(int studyPoints){
        var person = PeopleMaker.createPerson("RichStudent2");
    }

    public void increaseStats(){
        for (Person person : this.people){
            person.increaseStats(10);
        }
    }

    public void getStats(){
        String s = "";

        for (Person person : this.people){
            s += "" + person.getClass().getName().toString() + person.getStudyPoints() + "\n";
        }
    }

}
