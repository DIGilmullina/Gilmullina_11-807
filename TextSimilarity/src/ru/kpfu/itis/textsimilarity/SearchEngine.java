package ru.kpfu.itis.textsimilarity;

import java.util.List;

public interface SearchEngine {
    List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources);
}
