package com.pedrolemos;
import java.util.HashMap;

public class WordCounter {
    HashMap<String, Integer> wordsMap = new HashMap<>();
    boolean caseSensitive;
    String separator;

    /**
     * Constructor for WordCounter
     * @param caseSensitive flag
     * @param separator for regex expression for splitting Strings
     */
    public WordCounter(boolean caseSensitive, String separator){
        this.caseSensitive = caseSensitive;
        this.separator = separator;
    }

    public void addToCalculation(String text) {
        String[] words;
        if (caseSensitive) {
            words = text.split(separator);
        } else {
            words = text.toLowerCase().split(separator);
        }

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