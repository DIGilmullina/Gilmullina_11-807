package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer a = new JaccardTextAnalyzer();
        TextAnalyzer b = new CosinusSimilarityTextAnalyzer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Откуда считываем значения?\nКонсоль - 1. Файл - 2\nЗаймёмся поиском? - 3");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Первый текст:");
            String text1 = sc.nextLine();
            System.out.println("Второй текст:");
            String text2 = sc.nextLine();
            double jacCoef = a.analyze(new SimpleTextProvider(text1), new SimpleTextProvider(text2));
            double cosCoef = b.analyze(new SimpleTextProvider(text1), new SimpleTextProvider(text2));
            System.out.println("Коэффициент схожести по Джакарду: " + jacCoef);
            System.out.println("Косинусова мера: " + cosCoef);
        }
        if (n == 2) {
            System.out.println("Введите пусть к первому файлу:");
            String m = sc.nextLine();
            System.out.println("Введите пусть ко второму файлу:");
            String k = sc.nextLine();
            File file1 = new File(m);
            File file2 = new File(k);
            double jacCoef = a.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
            double cosCoef = b.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
            System.out.println("Джакард через файл " + jacCoef);
            System.out.println("Косинус через файл " + cosCoef);
        }

    }
}
