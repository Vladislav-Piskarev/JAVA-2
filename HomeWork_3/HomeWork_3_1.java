package Java_2.Lesson_3.HomeWork_3;

import java.util.*;

public class HomeWork_3_1 {

    public static void main (String[] args) {

        List<String> words = Arrays.asList(
                "Один", "Два", "Три", "Четыре", "Пять",
                "Пять", "Шесть", "Семь", "Семь", "Восемь",
                "Девять","Десять", "Одиннадцать", "Двенадцать", "Тринадцать",
                "Четырнадцать", "Одиннадцать", "Пятнадцать", "Шестнадцать", "Один");

        Set<String> unWords = new HashSet<>(words);

        System.out.println("Список уникальных слов");
        System.out.println(unWords.toString());

        System.out.println("\nСколько раз повторяется слово");
        for (String key : unWords) {
            System.out.println(key + " - " + Collections.frequency(words, key));
        }
    }
}
