public class PeopleMaker {

    public static Person createPerson(String name){

        switch (name){
            case "Professor":
                return new Professor(100);
            case "RichStudent2":
                return new RichStudent2(50);
            case "Student":
                return new Student(20);
            default:
                return null;
        }
    }
}
