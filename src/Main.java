import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();
            String result = canGoOut(age, temperature);
            System.out.println("Возраст: " + age + " лет, Температура: " + temperature + " градусов - " + result);
        }
    }

    // Метод для генерации случайного возраста
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(61) + 10; // генерация числа от 10 до 70 (включительно)
    }

    // Метод для генерации случайной температуры
    public static int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(51) - 20; // генерация числа от -20 до 30 (включительно)
    }

    // Метод для определения, можно ли идти гулять
    public static String canGoOut(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
