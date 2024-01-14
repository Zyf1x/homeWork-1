import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(25, 15);
        test(18, 20);
        test(50, 5);
        test(30, 35);
        test(40, 10);

        test(generateRandomAge(), 10);
    }

    public static void test(int age, int temperature) {
        String result = canGoForAWalk(age, temperature);
        System.out.println("Age: " + age + ", Temperature: " + temperature + " - " + result);
    }

    public static String canGoForAWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}