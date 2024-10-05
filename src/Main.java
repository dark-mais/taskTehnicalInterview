import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        task1();
        System.out.println("task2");
        task2();
        System.out.println("task3");
        task3();
    }
    // Разделить строку по запятой и пробелу
    private static void task1() {
        String text = "Hello, this is a test string, split by commas.";
        String[] parts = text.split(",\\s*");
        // Вывод частей строки
        for (String part:parts) {
            System.out.println(part);
        }
    }

    // Используем StringTokenizer для разделения стоорки
    private static void task2() {
        String text = "Hello, this is a test string; split by different delimiters.";
        StringTokenizer tokenizer = new StringTokenizer(text, ",;.");
        // Вывод частей строки
        while (tokenizer.hasMoreTokens()) {
            String part = tokenizer.nextToken().trim(); // .trim убирает лишние пробелы
            System.out.println(part);
        }
    }

    // Создаем Pattern и используем его для разделения строки
    private static void task3() {
        String text = "Hello; this is a test-string, split by different delimiters!";
        Pattern pattern = Pattern.compile("[,;\\-!\\s]+");
        String[] parts = pattern.split(text);
        // Вывод частей строки
        for (String part : parts) {
            System.out.println(part);
        }
    }
}