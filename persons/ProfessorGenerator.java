package Files;

import java.util.concurrent.ThreadLocalRandom;

public class ProfessorGenerator {

    private static String[] names = {"Petyr", "Ivan", "Mariya", "Lilly", "Georgi", "Petya"};
    private static String[] titles = {"Professor", "PhD", "Asociate assisstant"};

    public static Professor make() {
        int arrayIndex = ThreadLocalRandom.current().nextInt(0, names.length);
        String name = names[arrayIndex];

        arrayIndex = ThreadLocalRandom.current().nextInt(0, titles.length);
        String title = titles[arrayIndex];

        int egn = ThreadLocalRandom.current().nextInt(111111, 999999);

        int age = ThreadLocalRandom.current().nextInt(18, 80);

        int height = ThreadLocalRandom.current().nextInt(150, 220);

        int weight = ThreadLocalRandom.current().nextInt(50, 220);

        return new Professor(name, title, egn, age, height, weight);
    }
}
