package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        List<String> words = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            String replacedWord = word.replace(".", "").replace(",", "").toLowerCase();
            if (map.containsKey(replacedWord)) {
                map.put(replacedWord, map.get(replacedWord) + 1);
            } else {
                map.put(replacedWord, 1);
            }

        }

        return map;

    }
}
