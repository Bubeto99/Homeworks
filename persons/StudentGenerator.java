package Files;

import java.util.concurrent.ThreadLocalRandom;

public class StudentGenerator {
    private static String[] names = {"Ivan", "Mariya", "Stoyan", "Petyr", "Petya", "Lilly"};
    private static String[] specialities = {"Informatics", "STD", "BIT", "Mathematics"};
    private static String[] universities = {"PU", "NBU", "SU", "UHT"};
    private static String[] genders = {"male", "female"};

    public static Student make() {
        int genderIndex = ThreadLocalRandom.current().nextInt(0, genders.length);
        String gender = genders[genderIndex];

        int arrayIndex = ThreadLocalRandom.current().nextInt(0, names.length);
        String name = names[arrayIndex];

        arrayIndex = ThreadLocalRandom.current().nextInt(0, specialities.length);
        String speciality = specialities[arrayIndex];

        arrayIndex = ThreadLocalRandom.current().nextInt(0, universities.length);
        String university = universities[arrayIndex];

        int facNumber = ThreadLocalRandom.current().nextInt(111111, 999999);

        int egn = ThreadLocalRandom.current().nextInt(111111, 999999);

        // добавяме генериране на години, височина и тегло
        int age = ThreadLocalRandom.current().nextInt(18, 30);

        int height = ThreadLocalRandom.current().nextInt(150, 220);

        int weight = ThreadLocalRandom.current().nextInt(50, 220);

        return new Student(name, egn, university, speciality, facNumber, age, height, weight, gender);
    }
}
