package com.pedrolemos;

public class Main {
    public static void main(String[] args) {
        String text = "Hello hello hi how are you I'm very good thank you";
        WordCounter wordCounter = new WordCounter();
        wordCounter.addToCalculation(text);
        wordCounter.addToCalculation("hello");
        wordCounter.showResults();
    }
}
