package com.pedrolemos;
import java.util.HashMap;

public class WordCounter {
    HashMap<String, Integer> wordsMap = new HashMap<>();

    public void addToCalculation(String text) {
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (wordsMap.containsKey(word)){
                int previousValue = wordsMap.get(word);
                wordsMap.put(word, previousValue+1);
                continue;
            }
            //First appearance of the word.
            wordsMap.put(word, 1);
        }
    }

    public void showResults() {
        for (String word : wordsMap.keySet()){
            System.out.println(word + ": " + wordsMap.get(word) + " time(s)");
        }
    }
}