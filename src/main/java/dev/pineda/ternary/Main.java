package dev.pineda.ternary;

public class Main {
    static void main() {
        int age = generateInteger(10, 30);
        String ageMessage;
        ageMessage = age > 18 ? "Adult" : "Minor";
        System.out.println("age = " + age);
        System.out.println("ageMessage = " + ageMessage);

        int score = generateInteger(0, 100);
        String scoreMessage;
        scoreMessage = score >= 90 ? "Excellent" : score >= 70 ? "Good" : "Regular";
        System.out.println("score = " + score);
        System.out.println("scoreMessage = " + scoreMessage);

        int accessLevel = generateInteger(0, 5);
        String accessMessage;
        accessMessage = accessLevel >= 3 ? "Total Access" : accessLevel >= 1 ? "Partial Access" : "Denied Access";
        System.out.println("accessLevel = " + accessLevel);
        System.out.println("accessMessage = " + accessMessage);
    }

    static int generateInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
