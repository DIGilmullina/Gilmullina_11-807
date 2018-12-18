package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;

public class TokenizerForCosinusSimilarity {

    public List<String> tokenize(String text) {
        text = text.replace(",", " ");
        String[] words = text.split(" ");
        List<String> uniqueWordsNotDelete = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            uniqueWordsNotDelete.add(word);
        }
        return uniqueWordsNotDelete;
    }

}
