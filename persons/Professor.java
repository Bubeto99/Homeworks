package Files;

import java.util.concurrent.ThreadLocalRandom;

public class Professor extends Person {

    private String title;

    public Professor(String title, String name, boolean isMale,
                     int age, int height, int weight) {
        super(name, age, height, weight);
        this.title = title;
    }

    public Professor(String name, String title, int egn, int age, int height, int weight) {
        super(name, egn, age, height, weight);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


