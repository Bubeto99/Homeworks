public  abstract class Person {

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    private int studyPoints;

    public Person(int studyPoints){
        this.setStudyPoints(studyPoints);
    }

    public int showStats(){
        return this.studyPoints;
    }

    public void increaseStats(int points){
        this.studyPoints += points;
    }
}
