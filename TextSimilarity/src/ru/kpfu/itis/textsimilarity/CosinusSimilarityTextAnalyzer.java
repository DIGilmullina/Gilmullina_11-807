package ru.kpfu.itis.textsimilarity;

import java.util.List;

public class CosinusSimilarityTextAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider text1, TextProvider text2) {
        List<String> list1 = new TokenizerForCosinusSimilarity().tokenize(text1.getText());
        List<String> list2 = new TokenizerForCosinusSimilarity().tokenize(text2.getText());
        List<String> list3 = new Tokenizer1().tokenize(text1.getText() + " " + text2.getText());
        return cosSimilarity(list1, list2, list3);
    }

    private double[] TF(List<String> pList, List<String> list3) {
        double[] arrcount = new double[list3.size()];
        double count = 0;
        for (String word : pList) {
            if (list3.contains(word)) {
                arrcount[list3.indexOf(word)]++;
            }
        }
        for (double i : arrcount) {
            count += i * i;
        }
        for (int i = 0; i < arrcount.length; i++) {
            arrcount[i] = arrcount[i] / Math.sqrt(count);
        }
        return arrcount;
    }

    private double cosSimilarity(List<String> list1, List<String> list2, List<String> list3) {
        double[] one = TF(list1, list3);
        double[] two = TF(list2, list3);
        double cosCount = 0;
        for (int i = 0; i < one.length; i++) {
            cosCount += one[i] * two[i];
        }
        return cosCount;
    }

}